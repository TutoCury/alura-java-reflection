package br.com.alura.java.reflection.aula2;

import java.util.HashMap;
import java.util.Map;

public class MapaDeClasses {

    private Map<String, String> mapa = new HashMap<>();

    public Class getClass(String key) throws ClassNotFoundException {
        String valor = mapa.get(key);
        if (valor != null) {
            return Class.forName(valor);
        } else {
            throw new RuntimeException("Chave inválida");
        }
    }

}
