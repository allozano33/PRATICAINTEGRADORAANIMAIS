package com.company;

public class Gato extends Animal{

    private String som;

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public Gato(String som) {
        this.som = som;



    }

    @Override
    public void emitirSom() {

    }
}
