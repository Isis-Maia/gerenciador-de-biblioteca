package com.mycompany.gerenciadordebiblioteca.model;
import com.mycompany.gerenciadordebiblioteca.util.ConnectionFactory;
import java.sql.*;
/**
 *
 * @author isismaia
 */
public class Usuario {
    // informações de usuario.
            // variaveis gerais, estão privadas para não serem diretamente modificadas.
            private int id;
            private String nome;
            private String cpf;
            private String email;
            private String localizacao;
            private String numero;
            private boolean funcionario;// para definir se é ou não funcionario
            private String senha;
            
            // Construtor sem id (antes de salvar)
            public Usuario(String nome, String cpf, String email, String localizacao, String numero, boolean funcionario, String senha){
                this.nome = nome;
                this.cpf = cpf;
                this.email = email;
                this.localizacao = localizacao;
                this.numero = numero;
                this.funcionario = funcionario;
                this.senha = senha;
            }
            // Construtor com id (pra quando já veio do banco)
            public Usuario(int id, String nome, String cpf, String email, String localizacao, String numero, boolean funcionario, String senha){
                this.id = id;   
                this.nome = nome;
                this.cpf = cpf;
                this.email = email;
                this.localizacao = localizacao;
                this.numero = numero;
                this.funcionario = funcionario;
                this.senha = senha;
            }


            // O que vai ser afetado quando colocado alguma informação na variavel.
            public int getId() { return id; }
            public void setId(int id) { this.id = id; }
            
            public String getNome() { return nome; }
            public void setNome(String nome) {this.nome = nome;}
            
            public String getCpf() { return cpf; }
            public void setCpf(String cpf) {this.cpf = cpf;}
            
            public String getEmail() { return email; }
            public void setEmail(String email) {this.email = email;}
            
            public String getLocalizacao() { return localizacao; }
            public void setLocalizacao(String localizacao) {this.localizacao = localizacao;}
            
            public String getNumero() { return numero; }
            public void setNumero(String numero) {this.numero = numero;}
            
            public boolean getFuncionario() { return funcionario; }
            public void setFuncionario(Boolean funcionario) {this.funcionario = funcionario;}
            
            public String getSenha() { return senha; }
            public void setSenha(String senha) {this.senha = senha;}
            
            
    }

