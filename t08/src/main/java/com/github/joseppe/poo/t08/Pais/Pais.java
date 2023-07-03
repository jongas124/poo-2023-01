package com.github.joseppe.t08.Pais;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    public String nome;
    public Cidade capital;
    public List<Cidade> cidades;

    public Pais(String n, Cidade c){
        this.nome = n;
        this.cidades = new ArrayList<>();
        cidades.add(c);
    }
    public String getNome() {
        return nome;
    }
    public List<Cidade> getCidades() {
        return cidades;
    }
    public void setCapital(Cidade capital) {
        this.capital = capital;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
