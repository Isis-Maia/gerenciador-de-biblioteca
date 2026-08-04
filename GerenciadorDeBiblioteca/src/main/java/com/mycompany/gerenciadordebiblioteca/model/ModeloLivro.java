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
            public int getId() { return id; }
            public void setId(int id) {this.id = id;}

            public String getTitulo() { return titulo; }
            public void setTitulo(String titulo) {this.titulo = titulo;}

            public String getPublicacao() { return publicacao; }
            public void setPublicacao(String publicacao) {this.publicacao = publicacao;}


            public String getAutor() { return autor; }
            public void setAutor(String autor) {this.autor = autor;}
            
            public int getQuantidade() { return quantidade; }
            public void setQuantidade(int quantidade) {this.quantidade = quantidade;}
            
            public String getGenero() { return genero; }
            public void setGenero(String genero) {this.genero = genero;}
        }
            
    }

