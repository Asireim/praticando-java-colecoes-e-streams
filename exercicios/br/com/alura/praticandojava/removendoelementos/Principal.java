package br.com.alura.praticandojava.removendoelementos;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> alunos = new ArrayList<>();

        alunos.add("Joana");
        alunos.add("Lucas");
        alunos.add("Pedro");
        alunos.add("Antônio");

        System.out.println("Lista inicial: " + alunos);

        alunos.remove(2);

        System.out.println("Lista após a exclusão: " + alunos);
    }
}
