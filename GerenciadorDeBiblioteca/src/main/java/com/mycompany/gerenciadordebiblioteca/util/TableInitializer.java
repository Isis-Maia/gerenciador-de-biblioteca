package com.mycompany.gerenciadordebiblioteca.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Responsavel por criar as tabelas do sistema, caso ainda nao existam.
 *
 * @author guilherme
 */
public class TableInitializer {

    public static void iniciar() {
        criarTabelaUsuarios();
        // Conforme novas tabelas forem definidas (livros, emprestimos, etc.),
        // adicione novos metodos criarTabelaX() e chame aqui.
    }

    private static void criarTabelaUsuarios() {
        String sql =
            "CREATE TABLE IF NOT EXISTS usuarios (" +
            "  id INT AUTO_INCREMENT PRIMARY KEY," +
            "  nome VARCHAR(150) NOT NULL," +
            "  cpf VARCHAR(11) NOT NULL UNIQUE," +
            "  email VARCHAR(150) NOT NULL UNIQUE," +
            "  telefone VARCHAR(20)," +
            "  endereco VARCHAR(150)," +
            "  fucionario BOOL NOT NULL" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(sql);
            System.out.println("Tabela \"usuarios\" garantida.");

        } catch (SQLException e) {
            System.out.println("Erro ao criar/verificar a tabela usuarios: " + e.getMessage());
        }
    }
}