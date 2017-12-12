package br.com.alura.java.reflection.aula4;

import java.util.Map;

public class Principal {

    public static void main(String[] args) throws Exception {
        Usuario u = new Usuario();
        u.setLogin("guerra");
        u.setSenha("senhadoguerra");
        u.setEmail("guerra@guerra.com");
        u.setPapel("professor");
        u.setAtivo(true);
        
        String xml = GeradorDeCoisas.getXML(u);
        System.out.println(xml);
        
        Map map = GeradorDeCoisas.getMap(u);
        System.out.println(map);
    }

}
