
package com.github.joseppe.t08.projetoL;
import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private List<String> linguagens;
    private String linguagem;

    public Projeto() {
        this.linguagens = new ArrayList<>();
    }

    public void insereLinguagem(String lingua) {
        linguagens.add(linguagem);
    }

    public List<String> getLinguagens() {
        return linguagens;
    }
}