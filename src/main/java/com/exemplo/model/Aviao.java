package com.exemplo.model;

import java.util.HashSet;
import java.util.Set;

public class Aviao {
    private Set<Pessoa> passageiros;

    public Aviao() {
        this.passageiros = new HashSet<>();
    }
}
