package br.com.alura.praticandojava.acessandoelementos;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();

        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Ana");
        funcionarios.add("Pedro");
        funcionarios.add("Antônio");

        System.out.println("Quantidade de funcionários: " + funcionarios.size());
        System.out.println("Segunda pessoa da lista: " + funcionarios.get(1));
    }
}
