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
    
    public Autor buscarNome(String nome) {
        String sql = "SELECT * FROM autor WHERE nome = ?";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                return new Autor(rs.getInt("id"), rs.getString("nome"));
            }
            return null; 
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar autor: " + e.getMessage(), e);
        }
    }
    
    public Autor cadastrar(Autor autor){
        String sql = "INSERT INTO autor (nome) VALUES (?)";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, autor.getNome());
            stmt.executeUpdate();
            ResultSet chaves = stmt.getGeneratedKeys();
            if (chaves.next()) {
                autor.setId(chaves.getInt(1));
            }
            System.out.println("autor cadastrado com sucesso!");
            return autor;

        } catch (SQLException e) {
            if (e.getErrorCode() == 1062){
                System.out.println("Autor já cadastrado.");
                return buscarNome(autor.getNome());
            } else {
                throw new RuntimeException("Erro ao cadastrar autor: " + e.getMessage(), e);
            }
        }
    }
    
    public Autor buscarOuCriar(String nome){
        Autor autor = buscarNome(nome);
        
        if (autor == null){
        autor = new Autor(nome);
        autor = cadastrar(autor);
        }
        
        return autor;
    }
}
