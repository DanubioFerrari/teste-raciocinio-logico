package com.exemplo.model;

public abstract class Pessoa {
    private String nome;
    private boolean podeDirigir;

    public Pessoa(String nome, boolean podeDirigir) {
        this.nome = nome;
        this.podeDirigir = podeDirigir;
    }

    public String getNome() {
        return nome;
    }

    public boolean podeDirigir() {
        return podeDirigir;
    }

}
