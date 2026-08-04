/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciadordebiblioteca;
import com.mycompany.gerenciadordebiblioteca.util.ConnectionFactory;
import com.mycompany.gerenciadordebiblioteca.util.DatabaseInitializer;
import com.mycompany.gerenciadordebiblioteca.util.TableInitializer;
import java.sql.Connection;

import com.mycompany.gerenciadordebiblioteca.model.Usuario;
import com.mycompany.gerenciadordebiblioteca.dao.UsuarioDAO;

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
    }
}
