package com.github.joseppe.t10;

public class Bicicleta {
    private String marca;
    private String condicao;
    private double valor;
    private int tamAro;
    private String material;
    
    public Bicicleta(String m, String c, double v, int aro, String mat) {
        this.marca = m;
        this.condicao = c;
        this.valor = v;
        this.tamAro = aro;
        this.material = mat;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getCondicao() {
        return condicao;
    }
    
    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public int getTamAro() {
        return tamAro;
    }
    
    public void setTamAro(int tamAro) {
        this.tamAro = tamAro;
    }
    
    public String getMaterial() {
        return material;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }
}