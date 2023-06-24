package com.github.joseppe.t08.Arquivo;

import java.util.List;


import java.util.ArrayList;
public class Arquivo {
    String name;
    List<Arquivo> gruposPermitidos;
    public Arquivo(String name){
        this.name = name;
        this.gruposPermitidos = new ArrayList<>();
    }
     public void adicionarPessoa(Arquivo g) {
        gruposPermitidos.add(g);
    }

    public String getName() {
        return name;
    }

    public List<Arquivo> getPessoas() {
        return gruposPermitidos;
    }
}

