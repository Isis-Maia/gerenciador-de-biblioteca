package com.mycompany.gerenciadordebiblioteca.model;

/*
 *
 * @author isismaia
 */
public class ModeloLivro {
    public abstract class Livro{
        private int id;
        private String titulo;
        private String publicacao;
        public String editora;
        private int autorId;
        private int quantidade;
        private String genero;
        
        public Livro(String titulo, String publicacao, int autor, int quantidade, String genero, String editora){
            this.titulo = titulo;
            this.publicacao = publicacao;
            this.autorId = autorId;
            this.quantidade = quantidade;
            this.genero = genero;
            this.editora = editora;
        }
        
        public Livro(int id, String titulo, String publicacao, int autor, int quantidade, String genero, String editora){
            this.id = id;
            this.titulo = titulo;
            this.publicacao = publicacao;
            this.autorId = autorId;
            this.quantidade = quantidade;
            this.genero = genero;
            this.editora = editora;
        }
        /**
         * 
         * @return e set 
         */
            public int getId() { return id; }
            public void setId(int id) {this.id = id;}

            public String getTitulo() { return titulo; }
            public void setTitulo(String titulo) {this.titulo = titulo;}

            public String getPublicacao() { return publicacao; }
            public void setPublicacao(String publicacao) {this.publicacao = publicacao;}


            public int getAutor() { return autorId; }
            public void setAutor(int autor) {this.autorId = autor;}
            
            public int getQuantidade() { return quantidade; }
            public void setQuantidade(int quantidade) {this.quantidade = quantidade;}
            
            public String getGenero() { return genero; }
            public void setGenero(String genero) {this.genero = genero;}
        }
            
    }

