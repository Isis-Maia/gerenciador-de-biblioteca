/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciadordebiblioteca;
import com.mycompany.gerenciadordebiblioteca.util.*;
import com.mycompany.gerenciadordebiblioteca.model.*;
import com.mycompany.gerenciadordebiblioteca.dao.*;

import com.mycompany.gerenciadordebiblioteca.view.RegistrodeUsuario;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.sql.Connection;
import com.mycompany.gerenciadordebiblioteca.controller.CadastroBD;
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
        
        new RegistrodeUsuario().setVisible(true);
         
        LivroDAO dao = new LivroDAO();
        Livro livro = new Livro("Dom carmuso", 1884, 5, "Romance", "SLA");
        dao.cadastrar(livro, "Machado de Assis");
        
    }
}
