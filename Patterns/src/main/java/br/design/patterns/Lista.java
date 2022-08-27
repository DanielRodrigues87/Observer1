package br.design.patterns;

import java.util.ArrayList;

public class Lista {
    public ArrayList<Integer> numeros = new ArrayList<>();

    public ArrayList<Observador> observadores = new ArrayList<>();

    public void adicionarNumero(int n){
        numeros.add(n);
        notificarObservadores();
    }

    public void adicionarObservador(Observador observador){
        if (!observadores.contains(observador)){
            observadores.add(observador);
        }
    }

    public void removerObservador(Observador observador){
        observadores.remove(observador);
    }

    public void notificarObservadores(){
        for (Observador observador : observadores){
            observador.executarAcao(numeros);
        }
    }

    @Override
    public  String toString(){
        return "Numeros atuais: " + numeros;
    }
}
