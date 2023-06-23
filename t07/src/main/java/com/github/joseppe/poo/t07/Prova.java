package com.github.joseppe.t07;

public class Prova {
    private byte numQuestoes;
    
    private byte getNumQuestoes(){
        return numQuestoes;
    }

    public void setNumQuestoes(byte num){
        if(num > 0){
            numQuestoes = num;
        }
    }
}
