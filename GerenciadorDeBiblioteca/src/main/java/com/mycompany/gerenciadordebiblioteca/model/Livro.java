package com.mycompany.gerenciadordebiblioteca.model;

/*
 *
 * @author isismaia
 */
public class Livro {
        private int id;
        private String titulo;
        private int publicacao;
        public String editora;
        private int quantidade;
        private String genero;
        
        // Construtor sem id (antes de salvar)
        public Livro(String titulo, int publicacao,  int quantidade, String genero, String editora){
            this.titulo = titulo;
            this.publicacao = publicacao;
            this.quantidade = quantidade;
            this.genero = genero;
            this.editora = editora;
        }
        // Construtor com id (pra quando já veio do banco)
        public Livro(int id, String titulo, int publicacao, int quantidade, String genero, String editora){
            this.id = id;
            this.titulo = titulo;
            this.publicacao = publicacao;
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

            public int getPublicacao() { return publicacao; }
            public void setPublicacao(int publicacao) {this.publicacao = publicacao;}
            
            public int getQuantidade() { return quantidade; }
            public void setQuantidade(int quantidade) {this.quantidade = quantidade;}
            
            public String getGenero() { return genero; }
            public void setGenero(String genero) {this.genero = genero;}

            public String getEditora() { return editora; }

            public void setEditora(String editora) { this.editora = editora; }
            
        }
            

