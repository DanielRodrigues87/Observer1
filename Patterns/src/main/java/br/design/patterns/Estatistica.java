package br.design.patterns;

import java.util.ArrayList;

public class Estatistica implements Observador {

    @Override
    public void executarAcao(ArrayList<Integer> numeros){
        System.out.println("Fui notificado.");
        System.out.println("Recebi os seguintes itens na notificação: " + numeros);
    }

}
