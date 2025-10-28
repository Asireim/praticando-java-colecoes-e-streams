package br.com.alura.praticandojava.calculandoestatisticasdasnotas;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        double total = notas.stream().reduce(0.0, Double::sum);
        double media = total / notas.size();
        double menor = notas.stream().min(Double::compare).get();
        double maior = notas.stream().max(Double::compare).get();

        System.out.printf("""
                A média das notas é: %.1f
                A menor nota foi: %.1f
                A maior nota foi: %.1f
                """, media, menor, maior);
    }
}
