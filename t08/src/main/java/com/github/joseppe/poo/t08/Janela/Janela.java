package com.github.joseppe.t08.Janela;
import java.util.ArrayList;
import java.util.List;

public class Janela {
    private List<ElementoInteracao> elementos;

    public Janela() {
        this.elementos = new ArrayList<>();
    }

    public void adicionarElemento(ElementoInteracao elemento) {
        elementos.add(elemento);
    }

    public void removerElemento(ElementoInteracao elemento) {
        elementos.remove(elemento);
    }

    public void destruir() {
        for (ElementoInteracao elemento : elementos) {
            elemento.destruir();
        }
    }
}
