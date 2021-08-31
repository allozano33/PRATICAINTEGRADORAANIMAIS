package com.company;

public class Vaca extends Animal{

    private String som;



    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public Vaca(String som) {
        this.som = som;


    }

    @Override
    public void emitirSom() {

    }
}
