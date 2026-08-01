package com.mycompany.gerenciadordebiblioteca.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Detecta o sistema operacional, inicia o XAMPP (Apache + MySQL)
 * automaticamente e garante que o banco de dados "biblioteca" exista
 * antes do restante do programa rodar.
 *
 *
 * @author guilherme
 */
public class DatabaseInitializer {

    
    private static final String DB_NAME = "biblioteca";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";
    private static final String DB_HOST = "localhost";
    private static final int DB_PORT = 3306;

    // URL "raiz" do MySQL
    private static final String ROOT_URL = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/";

    private static final String XAMPP_DIR_WINDOWS = "C:\\xampp";
    private static final String XAMPP_DIR_LINUX = "/opt/lampp";

    private static final int MAX_TENTATIVAS = 15;
    private static final int INTERVALO_MS = 2000;

    public static void iniciar() {
        String so = System.getProperty("os.name").toLowerCase();

        try {
            if (so.contains("win")) {
                iniciarWindows();
            } else if (so.contains("nux") || so.contains("nix")) {
                iniciarLinux();
            } else {
                System.out.println("SO nao reconhecido (" + so + "). Inicie o XAMPP manualmente.");
            }
        } catch (IOException e) {
            System.out.println("Nao foi possivel iniciar o XAMPP automaticamente: " + e.getMessage());
        }

        aguardarMySQL();
        criarBancoSeNaoExistir();
    }

    private static void iniciarWindows() throws IOException {
        System.out.println("Windows detectado. Iniciando XAMPP...");
        new ProcessBuilder(XAMPP_DIR_WINDOWS + "\\apache_start.bat").start();
        new ProcessBuilder(XAMPP_DIR_WINDOWS + "\\mysql_start.bat").start();
    }

    private static void iniciarLinux() throws IOException {
        System.out.println("Linux detectado. Iniciando XAMPP (pode exigir sudo sem senha configurado)...");
        new ProcessBuilder("sudo", XAMPP_DIR_LINUX + "/lampp", "start").start();
    }

    private static void aguardarMySQL() {
        System.out.println("Aguardando o MySQL ficar disponivel...");

        for (int i = 1; i <= MAX_TENTATIVAS; i++) {
            try (Connection conn = DriverManager.getConnection(ROOT_URL, DB_USER, DB_PASS)) {
                System.out.println("MySQL disponivel!");
                return;
            } catch (SQLException e) {
                System.out.println("  ...tentativa " + i + "/" + MAX_TENTATIVAS);
                try {
                    Thread.sleep(INTERVALO_MS);
                } catch (InterruptedException ignored) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        System.out.println("MySQL nao respondeu a tempo. Verifique se o XAMPP subiu corretamente.");
    }

    private static void criarBancoSeNaoExistir() {
        try (Connection conn = DriverManager.getConnection(ROOT_URL, DB_USER, DB_PASS);
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(
                "CREATE DATABASE IF NOT EXISTS " + DB_NAME +
                " CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;"
            );
            System.out.println("Banco de dados \"" + DB_NAME + "\" garantido.");

        } catch (SQLException e) {
            System.out.println("Erro ao criar/verificar o banco de dados: " + e.getMessage());
        }
    }
}