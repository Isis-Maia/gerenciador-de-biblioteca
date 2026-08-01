/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciadordebiblioteca;
import com.mycompany.gerenciadordebiblioteca.util.ConnectionFactory;
import java.sql.Connection;

/**
 *
 * @author guilherme
 */
public class GerenciadorDeBiblioteca {

    public static void main(String[] args) {
        Connection conn = ConnectionFactory.getConnection();
        if (conn != null){
            System.out.println("Conexão bem-sucedida!");
            ConnectionFactory.closeConnection(conn);
        }
    }
}
