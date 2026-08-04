package com.mycompany.gerenciadordebiblioteca.model;

/**
 *
 * @author isismaia
 */
public class ModeloLivro {
    public abstract class Livro{
        private int id;
        private String titulo;
        private String publicacao;
        private String autor;
        private int quantidade;
        private String genero;
        
        public Livro(int id, String titulo, String publicacao, String autor, int quantidade, String genero){
            this.id = id;
            this.titulo = titulo;
            this.publicacao = publicacao;
            this.autor = autor;
            this.quantidade = quantidade;
            this.genero = genero;
        }
    }
}
