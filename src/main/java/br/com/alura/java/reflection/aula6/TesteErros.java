package br.com.alura.java.reflection.aula6;

import br.com.alura.java.reflection.aula5.Validador;
import java.lang.reflect.Method;

public class TesteErros {

    public static void main(String[] args) throws Exception {
        TesteErros obj = new TesteErros();
        Class<?> c = obj.getClass();
        
        Method m = c.getMethod("metodo", String.class);
        m.invoke(obj, "1");
        
        Usuario u = new Usuario();
        u.setEmail("sem@arroba.com");
        u.setSenha("123456789");
        Validador.testarObjeto(u);
    }
    
    public void metodo(String s) {
        System.out.println("chamou o metodo com o parametro s = " + s);
    }
    
}
