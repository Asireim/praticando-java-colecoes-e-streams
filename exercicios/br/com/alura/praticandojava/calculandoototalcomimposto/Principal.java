package br.com.alura.praticandojava.calculandoototalcomimposto;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        double total = precosProdutos.stream().reduce(0.0, Double::sum);
        double imposto = total * 0.08;
        double totalComImposto = (total + imposto);

        System.out.printf("Valor total antes do imposto: R$ %.2f%n", total);
        System.out.printf("Valor total com imposto de 8%%: R$ %.2f%n", totalComImposto);
    }
}
