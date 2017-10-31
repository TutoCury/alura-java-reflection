package br.com.alura.java.reflection;

import java.util.ArrayList;
import java.util.List;

public class ValidadorNulo {

    public static List<String> getAtributosNulos(Produto p) {
        List<String> lista = new ArrayList<>();
        if (p.codigo == null) {
            lista.add("codigo");
        }
        if (p.nome == null) {
            lista.add("nome");
        }
        if (p.fornecedor == null) {
            lista.add("fornecedor");
        }
        if (p.preco == null) {
            lista.add("preco");
        }
        if (p.descricao == null) {
            lista.add("descricao");
        }
        return lista;
    }

    public static List<String> getAtributosNulos(Usuario u) {
        List<String> lista = new ArrayList<>();
        if (u.login == null) {
            lista.add("login");
        }
        if (u.senha == null) {
            lista.add("senha");
        }
        if (u.email == null) {
            lista.add("email");
        }
        if (u.papel == null) {
            lista.add("papel");
        }
        if (u.ativo == null) {
            lista.add("ativo");
        }
        return lista;
    }

}
