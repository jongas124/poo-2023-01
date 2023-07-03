package com.github.joseppe.t08.Escola;

public class Escola {
    public String nome;
    public Endereco endereco;

    public Escola(String nome, Endereco end){
        this.nome = nome;
        this.endereco = end;
    }
    public String getNome() {
        return nome;
    }
}
