package com.company;

public class Cachorro extends Animal {
    private String som;



    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public Cachorro(String som) {
        this.som = som;


    }

    @Override
    public void emitirSom() {

    }
}
