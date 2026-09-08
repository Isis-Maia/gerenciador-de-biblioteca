package com.mycompany.gerenciadordebiblioteca.model;

/*
 *
 * @author isismaia
 */
public class Livro {
        private int id;
        private String titulo;
        private int paginas;
        private int publicacao;
        public String editora;
        private int quantidade;
        private String genero;
        private String descricao;
        
        // Construtor sem id (antes de salvar)
        public Livro(String titulo,int paginas, int publicacao,  int quantidade, String genero, String editora, String descricao){
            this.titulo = titulo;
            this.paginas = paginas;
            this.publicacao = publicacao;
            this.quantidade = quantidade;
            this.genero = genero;
            this.editora = editora;
            this.descricao = descricao;
        }
        // Construtor com id (pra quando já veio do banco)
        public Livro(int id, String titulo,int paginas, int publicacao, int quantidade, String genero, String editora, String descricao){
            this.id = id;
            this.titulo = titulo;
            this.paginas = paginas;
            this.publicacao = publicacao;
            this.quantidade = quantidade;
            this.genero = genero;
            this.editora = editora;
            this.descricao = descricao;
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

            public String getDescricao() { return descricao; }
            public void setDescricao(String descricao) { this.descricao = descricao; }

            public int getPaginas() {
                return paginas;
            }

            public void setPaginas(int paginas) {
                this.paginas = paginas;
            }
            
            
            
             
        }
            

