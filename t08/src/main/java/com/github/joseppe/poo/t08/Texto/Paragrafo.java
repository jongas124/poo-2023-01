package com.github.joseppe.t08.Texto;

import java.util.ArrayList;
import java.util.List;

public class Paragrafo {
    public List<Sentença> sentenças;

    public Paragrafo(Sentença s){
        this.sentenças = new ArrayList<>();
        sentenças.add(s);
    }
}
