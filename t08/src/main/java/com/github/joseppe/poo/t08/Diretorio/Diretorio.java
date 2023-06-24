package com.github.joseppe.t08.Diretorio;
import java.util.List;
public class Diretorio {
    String NameDiretorio;
    User Dono;
    List<User> UPermitidos;

    public Diretorio(String Dame, User Dono){
        this.NameDiretorio = name;
        this.Dono = dono;
    }

    public void addUsuario(User U){
        uPermitidos.add(U);
        u.acesso(this.NameDiretorio);
    }
}