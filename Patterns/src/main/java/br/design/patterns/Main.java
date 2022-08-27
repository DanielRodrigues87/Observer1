package br.design.patterns;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Estatistica e = new Estatistica();
        lista.adicionarObservador(e);
        System.out.println(lista.observadores.size());
        lista.adicionarNumero(50);
        System.out.println(lista);

    }
}
