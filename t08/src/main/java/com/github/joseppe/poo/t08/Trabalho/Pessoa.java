package com.github.joseppe.t08.trabalho;

public class Pessoa {
    private String nome;
    public double id;
    private double salario;
    public Pessoa(String nome, int id){
        this.nome = nome;
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public double getId(){
        return id;
    }
    public double getSal(){
        return salario;
    }
    public void setSal(double sal){
        this.salario = sal;
    }
}
