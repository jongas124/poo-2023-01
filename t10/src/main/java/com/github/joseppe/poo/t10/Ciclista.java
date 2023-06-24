package com.github.joseppe.t10;
import java.util.ArrayList;
import java.util.List;

public class Ciclista {
    private String nome;
    private boolean genero;
    private int idade;
    private List<Bicicleta> bicicletas;

    public Ciclista(String nome, boolean genero, Bicicleta b) {
        this.nome = nome;
        this.genero = genero;
        this.bicicletas = new ArrayList<>();
        this.bicicletas.add(b);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void adicionarBicicleta(Bicicleta b) {
        bicicletas.add(b);
    }
}