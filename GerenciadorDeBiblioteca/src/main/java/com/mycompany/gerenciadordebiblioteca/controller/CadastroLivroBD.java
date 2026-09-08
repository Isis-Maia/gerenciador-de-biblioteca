/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciadordebiblioteca.controller;
import com.mycompany.gerenciadordebiblioteca.dao.LivroDAO;
import com.mycompany.gerenciadordebiblioteca.model.Livro;
import com.mycompany.gerenciadordebiblioteca.dao.AutorDAO;
import com.mycompany.gerenciadordebiblioteca.model.Autor;

/**
 *
 * @author isismaia
 */
public class CadastroLivroBD {
    public void AbrirRegistro(Livro livro, Autor autor) {

        if (livro != null) {
            System.out.println("Usuario recebido:");
            System.out.println(livro.getTitulo());
            System.out.println(livro.getPaginas());
            System.out.println(livro.getPublicacao());
            System.out.println(autor.getNome());
            System.out.println(livro.getQuantidade());
            System.out.println(livro.getGenero());
            System.out.println(livro.getEditora());
            System.out.println(livro.getDescricao());
            
            LivroDAO dao = new LivroDAO();
            dao.cadastrar(livro, autor);
        } else {
            System.out.println("Error 1717 : Livro Não Recebido");
        }
    }
}
