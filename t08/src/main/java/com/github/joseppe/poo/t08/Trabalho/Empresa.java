package com.github.joseppe.t08.trabalho;
import java.util.List;
import java.util.ArrayList;
public class Empresa {
    public String nomeEmpresa;
    public String empregador;
    private List<Pessoa> empregados;
    private double salário;

    public Empresa(String nome, String emp, double sal){
        this.nomeEmpresa = nome;
        this.empregador = emp;
        this.empregados = new ArrayList<>(null);
        this.salário = sal;
    }
    public void contratar(Pessoa p){
        empregados.add(p);
        p.setSal(salário);
    }
}
