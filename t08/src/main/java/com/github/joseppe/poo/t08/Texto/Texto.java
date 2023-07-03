package com.github.joseppe.t08.Texto;

import java.util.ArrayList;
import java.util.List;

public class Texto {
    public List<Paragrafo> paragrafos;

    public Texto(Paragrafo s){
        this.paragrafos = new ArrayList<>();
        paragrafos.add(s);
    }
}
