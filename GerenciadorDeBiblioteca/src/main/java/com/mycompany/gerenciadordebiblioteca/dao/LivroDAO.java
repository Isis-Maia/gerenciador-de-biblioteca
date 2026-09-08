package com.mycompany.gerenciadordebiblioteca.dao;

import com.mycompany.gerenciadordebiblioteca.model.Livro;
import com.mycompany.gerenciadordebiblioteca.util.ConnectionFactory;
import com.mycompany.gerenciadordebiblioteca.model.Autor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author guilherme
 */
public class LivroDAO {
    public void cadastrar (Livro livro, Autor autor){
        String sql = "INSERT INTO livros (titulo, publicacao, Nome, quantidade, genero, editora, descricao) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, livro.getTitulo());
            stmt.setInt(2, livro.getPaginas());
            stmt.setInt(3, livro.getPublicacao());
            stmt.setString(4, autor.getNome());
            stmt.setInt(5, livro.getQuantidade());
            stmt.setString(6, livro.getGenero());
            stmt.setString(7, livro.getEditora());
            stmt.setString(8, livro.getDescricao());
            
            stmt.executeUpdate();
            System.out.println("Livro cadastrado com sucesso!");
            
        } catch (SQLException e) {
            if (e.getErrorCode() == 1062){
                System.out.println("Livro já cadastrado.");
            } else {
                throw new RuntimeException("Erro ao cadastrar Livro: " + e.getMessage(), e);
            }
        }
    }
}
