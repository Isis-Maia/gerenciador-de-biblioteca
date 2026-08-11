/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciadordebiblioteca.controller;
import com.mycompany.gerenciadordebiblioteca.model.Usuario;
import com.mycompany.gerenciadordebiblioteca.view.RegistrodeUsuario;

/**
 *
 * @author caiomeira
 */
public class CadastroBD {
    
    public void AbrirRegistro() {
    
        RegistrodeUsuario cadastroDB = new RegistrodeUsuario();

        cadastroDB.setVisible(true);

        System.out.println("A janela foi fechada!");

        Usuario usuario = cadastroDB.getUsuario();

        if (usuario != null) {
            System.out.println("Usuario recebido:");
            System.out.println(usuario.getNome());
            System.out.println(usuario.getCpf());
            System.out.println(usuario.getEmail());
            System.out.println(usuario.getLocalizacao());
            System.out.println(usuario.getNumero());
            System.out.println(usuario.getFuncionario());
        } else {
            System.out.println("Error 1717 : Usuario Não Recebido");
        }
    }
}
