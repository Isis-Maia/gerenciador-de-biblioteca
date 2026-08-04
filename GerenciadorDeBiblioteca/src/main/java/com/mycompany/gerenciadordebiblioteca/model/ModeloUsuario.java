package com.mycompany.gerenciadordebiblioteca.model;

/**
 *
 * @author isismaia
 */
public class ModeloUsuario {
    // informações de usuario.
    public abstract class Usuario{
            // variaveis gerais, estão privadas para não serem diretamente modificadas.
            private String nome;
            private String cpf;
            private String email;
            private String localizacao;
            private int numero;
            private boolean funcionario; // para definir se é ou não funcionario
            
            public Usuario(String nome, String cpf, String email, String localizacao, int numero, boolean funcionario){
                this.nome = nome;
                this.cpf = cpf;
                this.email = email;
                this.localizacao = localizacao;
                this.numero = numero;
                this.funcionario = funcionario;
            }

            // O que vai ser afetado quando colocado alguma informação na variavel.
            public String getNome() { return nome; }
            public void setNome(String nome) {this.nome = nome;}
            public String getCpf() { return cpf; }
            public void setCpf(String cpf) {this.cpf = cpf;}
            public String getEmail() { return email; }
            public void setEmail(String email) {this.email = email;}
            public String getLocalizacao() { return localizacao; }
            public void setLocalizacao(String localizacao) {this.localizacao = localizacao;}
            public int getNumero() { return numero; }
            public void setNumero(int numero) {this.numero = numero;}
            public boolean getFuncionario() { return funcionario; }
            public void setFuncionario(Boolean funcionario) {this.funcionario = funcionario;}
            
    }
}
