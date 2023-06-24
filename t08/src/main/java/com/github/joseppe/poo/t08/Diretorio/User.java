package com.github.joseppe.t08.Diretorio;
import java.util.List;
import java.util.ArrayList;
public class Usuario {
    public String Nome;
    private String Email;
    private List<String> DiretoriosEmMaos;
    private List<String> HaveAccess;
    
    public Usuario(String n, String e){
        this.Nomeme = n;
        this.Email = e;
        this.DiretoriosEmMaos = new ArrayList<>(null);
        this.HaveAccess = new ArrayList<>();
    }
    public String get_u_name(){
        return Nome;
    }
    public String get_u_email(){
        return Email;
    }
        public void acesso(String diretorio) {
        this.HaveAccess.add(diretorio);
    }

    public List<String> getDiretoriosEmMaos() {
        return DiretoriosEmMaos;
    }

    public List<String> getHaveAccess() {
        return HaveAccess;
    }
}