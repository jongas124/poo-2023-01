package com.github.joseppe.t08.Pais;

public class Cidade {
    public String nome;
    private int habitantes;

    public Cidade(String n, int h){
        this.nome = n;
        this.habitantes = h;
    }
    public int getHabitantes() {
        return habitantes;
    }
    public String getNome() {
        return nome;
    }
    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
