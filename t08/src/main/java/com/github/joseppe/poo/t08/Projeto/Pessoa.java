package com.github.joseppe.t08.Projeto;
import java.util.ArrayList;
import java.util.List;

public class PessoaProj {
    public String user_name;
    private List<ProjPessoa> project_list; 

    public PessoaProj(String name){
        this.user_name = name;
        this.project_list = new ArrayList<>();
    }
    public String getUserName(){
        return user_name;
    }
    public List<ProjPessoa> getProjectList(){
        return project_list;
    }
}
