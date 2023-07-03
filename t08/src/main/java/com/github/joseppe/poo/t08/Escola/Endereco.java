package com.github.joseppe.t08.Escola;

public class Endereco {
    public String rua;
    public String bairro;
    public int lote;
    public int CEP;

    public Endereco(String r, String b, int l, int c){
        this.rua = r;
        this.bairro = b;
        this.lote = l;
        this.CEP = c;
    }
    public String getBairro() {
        return bairro;
    }
    public int getLote() {
        return lote;
    }
    public String getRua() {
        return rua;
    }
    public int getCEP() {
        return CEP;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setLote(int lote) {
        this.lote = lote;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setCEP(int cEP) {
        CEP = cEP;
    }
}
