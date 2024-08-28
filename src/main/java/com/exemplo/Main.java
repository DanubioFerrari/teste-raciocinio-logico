package com.exemplo;

import com.exemplo.model.*;

public class Main {
    public static void main(String[] args) {
        Piloto piloto = new Piloto("Danubio - Piloto");
        ChefeServicoVoo chefeServicoVoo = new ChefeServicoVoo("Ytalo - Chefe");
        Comissaria comissaria1 = new Comissaria("Maria - Comissaria");
        Comissaria comissaria2 = new Comissaria("Ana - Comissaria");
        Oficial oficial1 = new Oficial("Adão - Oficial");
        Oficial oficial2 = new Oficial("Leo - Oficial");
        Presidiario presidiario = new Presidiario("Enzo - Presidiario");
        Policial policial = new Policial("Rogerio - Policial");

        GestorTransporte gestor = new GestorTransporte();

        gestor.adicionarPessoaAoTerminal(piloto);
        gestor.adicionarPessoaAoTerminal(chefeServicoVoo);
        gestor.adicionarPessoaAoTerminal(comissaria1);
        gestor.adicionarPessoaAoTerminal(comissaria2);
        gestor.adicionarPessoaAoTerminal(oficial1);
        gestor.adicionarPessoaAoTerminal(oficial2);
        gestor.adicionarPessoaAoTerminal(presidiario);
        gestor.adicionarPessoaAoTerminal(policial);
        System.out.println("Passageiros no terminal: " + gestor.getPassageirosNoTerminal().size());
        System.out.println("Passageiros no avião: " + gestor.getPassageirosNoAviao().size());
        System.out.println("==============================================================================================");

        try {
            gestor.embarcarParaAviao(piloto);
            gestor.embarcarParaAviao(chefeServicoVoo);
            gestor.transportarParaAviao();

            gestor.embarcarParaTerminal(chefeServicoVoo);
            gestor.transportarParaTerminal();

            gestor.embarcarParaAviao(chefeServicoVoo);
            gestor.embarcarParaAviao(comissaria1);
            gestor.transportarParaAviao();

            gestor.embarcarParaTerminal(chefeServicoVoo);
            gestor.transportarParaTerminal();

            gestor.embarcarParaAviao(chefeServicoVoo);
            gestor.embarcarParaAviao(comissaria2);
            gestor.transportarParaAviao();

            gestor.embarcarParaTerminal(chefeServicoVoo);
            gestor.transportarParaTerminal();

            gestor.embarcarParaAviao(chefeServicoVoo);
            gestor.embarcarParaAviao(oficial1);
            gestor.transportarParaAviao();

            gestor.embarcarParaTerminal(chefeServicoVoo);
            gestor.transportarParaTerminal();

            gestor.embarcarParaAviao(chefeServicoVoo);
            gestor.embarcarParaAviao(oficial2);
            gestor.transportarParaAviao();

            gestor.embarcarParaTerminal(chefeServicoVoo);
            gestor.transportarParaTerminal();

            gestor.embarcarParaAviao(policial);
            gestor.embarcarParaAviao(presidiario);
            gestor.transportarParaAviao();

            gestor.embarcarParaTerminal(piloto);
            gestor.transportarParaTerminal();

            gestor.embarcarParaAviao(piloto);
            gestor.embarcarParaAviao(chefeServicoVoo);
            gestor.transportarParaAviao();
            System.out.println("====FIM==========================================================================================");
            System.out.println("Passageiros no terminal: " + gestor.getPassageirosNoTerminal().size());
            System.out.println("Passageiros no avião: " + gestor.getPassageirosNoAviao().size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
