package com.mycompany.gerenciadordebiblioteca.dao;

import com.mycompany.gerenciadordebiblioteca.model.Usuario;
import com.mycompany.gerenciadordebiblioteca.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author olivense
 */
public class UsuarioDAO {
    
    public void cadastrar(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nome, cpf, email, localizacao, numero, funcionario, senha) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getLocalizacao());
            stmt.setString(5, usuario.getNumero());
            stmt.setBoolean(6, usuario.getFuncionario());
            stmt.setString(7, usuario.getSenha());

            stmt.executeUpdate();
            System.out.println("Usuário cadastrado com sucesso!");

        } catch (SQLException e) {
            if (e.getErrorCode() == 1062){
                System.out.println("Usuario já cadastrado.");
            } else {
                throw new RuntimeException("Erro ao cadastrar Usuario: " + e.getMessage(), e);
            }
        }
    }
    
    public List<Usuario> read() {
        
        String sql = "SELECT * FROM usuarios";
        List<Usuario> usuarios = new ArrayList<>();
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                
                Usuario usuario = new Usuario(0, "", "", "", "", "", true, "");
                
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setEmail(rs.getString("email"));
                usuario.setNumero(rs.getString("numero"));
                usuario.setLocalizacao(rs.getString("localizacao"));
                usuario.setFuncionario(rs.getBoolean("funcionario"));
                usuario.setSenha(rs.getString("senha"));
                usuarios.add(usuario);
                
            }
        
        } catch (SQLException e) {
           throw new RuntimeException("Erro ao cadastrar autor: " + e.getMessage(), e);
        }
        
        return usuarios;
    }
}
