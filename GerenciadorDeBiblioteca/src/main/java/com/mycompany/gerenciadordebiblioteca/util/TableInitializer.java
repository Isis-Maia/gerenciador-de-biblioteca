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
        criarTabelaAutor();
        criarTabelaLivros();
    }

    private static void criarTabelaUsuarios() {
        String sql =
            "CREATE TABLE IF NOT EXISTS usuarios (" +
            "  id INT AUTO_INCREMENT PRIMARY KEY," +
            "  nome VARCHAR(150) NOT NULL," +
            "  cpf VARCHAR(11) NOT NULL UNIQUE," +
            "  email VARCHAR(150) NOT NULL UNIQUE," +
            "  numero VARCHAR(20)," +
            "  localizacao VARCHAR(150)," +
            "  funcionario BOOL NOT NULL, " + 
            "  senha VARCHAR(150) NOT NULL" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(sql);
            System.out.println("Tabela \"usuarios\" garantida.");

        } catch (SQLException e) {
            System.out.println("Erro ao criar/verificar a tabela usuarios: " + e.getMessage());
        }
    }
    
    private static void criarTabelaAutor() {
        String sql =
            "CREATE TABLE IF NOT EXISTS autor (" +
            "  id INT AUTO_INCREMENT PRIMARY KEY," +
            "  nome VARCHAR(150) NOT NULL UNIQUE" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(sql);
            System.out.println("Tabela \"autor\" garantida.");

        } catch (SQLException e) {
            System.out.println("Erro ao criar/verificar a tabela autor: " + e.getMessage());
        }
    }
    
        private static void criarTabelaLivros() {
        String sql =
            "CREATE TABLE IF NOT EXISTS livros (" +
            "  id INT AUTO_INCREMENT PRIMARY KEY," +
            "  titulo VARCHAR(150) NOT NULL UNIQUE, " +
            "  editora VARCHAR(150)," +
            "  publicacao INT NOT NULL," +
            "  quantidade INT NOT NULL," +
            "  genero VARCHAR(20) NOT NULL," +
            "  autorId INT,"+
            "  FOREIGN KEY (autorId) REFERENCES autor(id)" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";

        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {

            stmt.executeUpdate(sql);
            System.out.println("Tabela \"livros\" garantida.");

        } catch (SQLException e) {
            System.out.println("Erro ao criar/verificar a tabela livros: " + e.getMessage());
        }
    }
}