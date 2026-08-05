package com.mycompany.gerenciadordebiblioteca.dao;

import com.mycompany.gerenciadordebiblioteca.model.Autor;
import com.mycompany.gerenciadordebiblioteca.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author guilherme
 */
public class AutorDAO {
    
    public void cadastrar(Autor autor){
        String sql = "INSERT INTO autor (nome) VALUES (?)";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, autor.getNome());

            stmt.executeUpdate();
            System.out.println("autor cadastrado com sucesso!");

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao cadastrar autor: " + e.getMessage(), e);
        }
    }
}
