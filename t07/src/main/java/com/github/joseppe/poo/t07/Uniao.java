package com.github.joseppe.t07;

import java.util.ArrayList;

import java.until.Objects;

public class Uniao {
    private ArrayList<Pessoa> filhos;
    private Pessoa parceiros[];

    public void novoFilho(Pessoa p){
        filhos.add(p);
    }

    public Uniao(Pessoa a, Pessoa b){
        parceiros[0] = a;
        parceiros[1] = b;
    }
}

