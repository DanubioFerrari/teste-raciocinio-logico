package com.exemplo.model;

import java.util.HashSet;
import java.util.Set;

public class GestorTransporte {
    private Veiculo veiculo;
    private Terminal terminal;
    private Aviao aviao;
    private Set<Pessoa> pessoasNoTerminal;
    private Set<Pessoa> pessoasNoAviao;

    public GestorTransporte() {
        this.veiculo = new Veiculo();
        this.terminal = new Terminal();
        this.aviao = new Aviao();
        this.pessoasNoTerminal = new HashSet<>();
        this.pessoasNoAviao = new HashSet<>();
    }

    public void embarcarParaAviao(Pessoa pessoa) throws Exception {
        if (!veiculo.estaCheio()) {
            if (pessoasNoTerminal.contains(pessoa)) {
                veiculo.adicionarPassageiro(pessoa);
                pessoasNoTerminal.remove(pessoa);
                System.out.println(pessoa.getNome() + " embarcou no veículo.");
            } else {
                throw new Exception("A pessoa não está no terminal.");
            }
        } else {
            throw new Exception("O veículo está cheio.");
        }

    }

    public void desembarcarNoAviao() throws Exception {
        Set<Pessoa> passageiros = new HashSet<>(veiculo.getPassageiros());

        for (Pessoa p : passageiros) {
            if (veiculo.getPassageiros().contains(p)) {
                veiculo.removerPassageiro(p);
                adicionarPessoaAoAviao(p);
            } else {
                throw new Exception("A pessoa não está no veículo.");
            }
        }
    }


    public void embarcarParaTerminal(Pessoa pessoa) throws Exception {
        if (!veiculo.estaCheio()) {
            if (pessoasNoAviao.contains(pessoa)) {
                veiculo.adicionarPassageiro(pessoa);
                pessoasNoAviao.remove(pessoa);
                System.out.println(pessoa.getNome() + " embarcou no veículo.");
            } else {
                throw new Exception("A pessoa não está no avião.");
            }
        } else {
            throw new Exception("O veículo está cheio.");
        }

    }

    public void desembarcarNoTerminal() throws Exception {
        Set<Pessoa> passageiros = new HashSet<>(veiculo.getPassageiros());

        for (Pessoa p : passageiros) {
            if (veiculo.getPassageiros().contains(p)) {
                veiculo.removerPassageiro(p);
                adicionarPessoaAoTerminal(p);
            } else {
                throw new Exception("A pessoa não está no veículo.");
            }
        }


    }

    public void transportarParaAviao() throws Exception {
        if (veiculo.estaCheio()) {
            if ( veiculo.verificaTemMotorista()) {
                desembarcarNoAviao();
                veiculo.esvaziarVeiculo();
                System.out.println("Veículo transportou passageiros para o avião.");
            } else {
                System.out.println("Veículo não possui passageiros habilitado para dirigir.");
            }

        } else {
            throw new Exception("O veículo não está cheio.");
        }
    }

    public void transportarParaTerminal() throws Exception {
        if (!veiculo.estaVazio()) {
            if (veiculo.verificaTemMotorista()) {
                desembarcarNoTerminal();
                veiculo.esvaziarVeiculo();
                System.out.println("Veículo transportou passageiros para o terminal.");
            } else {
                System.out.println("Veículo não possui passageiros habilitado para dirigir.");
            }

        } else {
            throw new Exception("O veículo está vazio.");
        }
    }

    public void adicionarPessoaAoTerminal(Pessoa pessoa) {
        pessoasNoTerminal.add(pessoa);
        System.out.println(pessoa.getNome() + " chegou ao terminal.");
    }


    public void adicionarPessoaAoAviao(Pessoa pessoa) {
        pessoasNoAviao.add(pessoa);
        System.out.println(pessoa.getNome() + " chegou no avião.");

    }

    public Set<Pessoa> getPassageirosNoTerminal() {
        return pessoasNoTerminal;
    }

    public Set<Pessoa> getPassageirosNoAviao() {
        return pessoasNoAviao;
    }


}

