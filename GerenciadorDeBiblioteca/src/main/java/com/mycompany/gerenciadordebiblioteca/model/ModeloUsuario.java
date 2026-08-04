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
            public String getCpf() { return cpf; }
            public String getEmail() { return email; }
            public String getLocalizacao() { return localizacao; }
            public int getNumero() { return numero; }
            public boolean getFuncionario() { return funcionario; }
            
    }
}
