package br.com.alura.praticandojava.calculandooquadradodosnumeros;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);

        List<Double> quadrado = numeros.stream().map(n -> Math.pow(n,2)).toList();

        System.out.println("Quadrado dos números: " + quadrado);
    }
}
