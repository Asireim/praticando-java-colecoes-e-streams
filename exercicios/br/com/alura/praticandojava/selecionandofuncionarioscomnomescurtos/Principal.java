package br.com.alura.praticandojava.selecionandofuncionarioscomnomescurtos;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");

        List<String> funcionarios5letras = funcionarios.stream().filter(f -> f.length() <= 5).toList();

        System.out.println(funcionarios5letras);
    }
}
