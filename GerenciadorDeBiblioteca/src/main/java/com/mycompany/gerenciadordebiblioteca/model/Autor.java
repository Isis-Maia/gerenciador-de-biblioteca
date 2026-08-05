/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciadordebiblioteca.model;

/**
 *
 * @author guilherme
 */
public class Autor {
    private int id;
    private String nome;
    
    // Construtor sem id (antes de salvar)
    public Autor(String nome) {
        this.nome = nome;
    }

    // Construtor com id (pra quando já veio do banco)
    public Autor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    

}
