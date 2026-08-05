/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciadordebiblioteca;
import com.mycompany.gerenciadordebiblioteca.util.*;
import com.mycompany.gerenciadordebiblioteca.model.*;
import com.mycompany.gerenciadordebiblioteca.dao.*;

import java.sql.Connection;
/**
 *
 * @author guilherme
 */
public class GerenciadorDeBiblioteca {

    public static void main(String[] args) {
        DatabaseInitializer.iniciar();
        TableInitializer.iniciar();
        
        Connection conn = ConnectionFactory.getConnection();
        if (conn != null){
            System.out.println("Conexão bem-sucedida!");
            ConnectionFactory.closeConnection(conn);
        }
        
        Usuario novoUsuario = new Usuario("Maria","12345678900","maria@email.com","Rua das Flores, 123","82999999999",false);
        UsuarioDAO dao = new UsuarioDAO();
        dao.cadastrar(novoUsuario);
        
        Autor autor = new Autor("Machado de Assis");
        AutorDAO autorDAO = new AutorDAO();
        autorDAO.cadastrar(autor);
        
        Livro livro = new Livro("Dom carmuso", "1890", 1, 2, "sla", "xyz");
        LivroDAO livroDAO = new LivroDAO();
        livroDAO.cadastrar(livro);
    }
}
