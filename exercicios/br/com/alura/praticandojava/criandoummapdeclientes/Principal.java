package br.com.alura.praticandojava.criandoummapdeclientes;

import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {
        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Fulano");
        clientes.put(2, "Ciclano");
        clientes.put(3, "Beltrano");

        System.out.println(clientes.get(2));
    }
}
