package br.com.alura.praticandojava.verificandoseachaveexiste;

import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {
        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Joana");
        clientes.put(5, "Karen");

        int id = 5;

        if(clientes.containsKey(id)) {
            System.out.println("O nome do cliente com ID " + id + " é: " + clientes.get(id));
        } else {
            System.out.println("Cliente com ID " + id + " não encontrado.");
        }
    }
}
