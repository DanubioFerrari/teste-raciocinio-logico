package com.exemplo.model;

import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    private List<Pessoa> passageiros;

    public Veiculo() {
        this.passageiros = new ArrayList<>();
    }

    public void adicionarPassageiro(Pessoa pessoa) throws Exception {
        if (passageiros.size() >= 2) {
            throw new Exception("O veículo já está cheio. Não é possível adicionar mais passageiros.");
        }
        passageiros.add(pessoa);
    }

    public void removerPassageiro(Pessoa pessoa) {
        passageiros.remove(pessoa);
    }

    public List<Pessoa> getPassageiros() {
        return passageiros;
    }

    public void esvaziarVeiculo() {
        passageiros.clear();
    }

    public boolean estaCheio() {
        return passageiros.size() == 2;
    }

    public boolean estaVazio() {
        return passageiros.isEmpty();
    }

    public boolean verificaTemMotorista(){
        boolean temMotorista = false;
        for (Pessoa p : passageiros ) {
             if (p.podeDirigir()){
               temMotorista = true;
               break;
             }
        }
        return temMotorista;
    }

}
