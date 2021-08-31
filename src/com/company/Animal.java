package com.company;

public abstract class Animal {

    public void emitirSom(Object animal) {
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            System.out.println("O Cachorro faz:  " + cachorro.getSom());
        } else if (animal instanceof Gato) {
            Gato gato = (Gato) animal;
            System.out.println("O Gato faz:  " + gato.getSom());
        } else if (animal instanceof Vaca) {
            Vaca vaca = (Vaca) animal;
            System.out.println("A Vaca faz:  " + vaca.getSom());


            public abstract void emitirSom();
        }
    }