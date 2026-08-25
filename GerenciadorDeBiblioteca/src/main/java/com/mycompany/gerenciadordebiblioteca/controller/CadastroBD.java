/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciadordebiblioteca.controller;
import com.mycompany.gerenciadordebiblioteca.model.Usuario;
import com.mycompany.gerenciadordebiblioteca.view.RegistrodeUsuario;
import com.mycompany.gerenciadordebiblioteca.dao.UsuarioDAO;

/**
 *
 * @author caiomeira
 */
public class CadastroBD {
    
    public void AbrirRegistro(Usuario usuario) {

        if (usuario != null) {
            System.out.println("Usuario recebido:");
            System.out.println(usuario.getNome());
            System.out.println(usuario.getCpf());
            System.out.println(usuario.getEmail());
            System.out.println(usuario.getLocalizacao());
            System.out.println(usuario.getNumero());
            System.out.println(usuario.getFuncionario());
            System.out.println(usuario.getSenha());
            
            UsuarioDAO dao = new UsuarioDAO();
            dao.cadastrar(usuario);
        } else {
            System.out.println("Error 1717 : Usuario Não Recebido");
        }
    }
}
