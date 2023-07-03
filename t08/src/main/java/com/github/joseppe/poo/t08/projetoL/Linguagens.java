package com.github.joseppe.t08.projetoL;

public class Linguagens {
    String nomeLing;
    String tipoLing;

    public Linguagens(String n, String t){
        this.nomeLing = n;
        this.tipoLing = t;
    }
    public String getNomeLing() {
        return nomeLing;
    }
    public String getTipoLing() {
        return tipoLing;
    }
    public void setNomeLing(String nomeLing) {
        this.nomeLing = nomeLing;
    }
    public void setTipoLing(String tipoLing) {
        this.tipoLing = tipoLing;
    }
}
