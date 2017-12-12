package br.com.alura.java.reflection.aula5;

import java.lang.reflect.Method;

public class Validador {

    public static boolean validarObjeto(Object obj) throws Exception {
        boolean result = true;

        Class<?> c = obj.getClass();
        for (Method m : c.getMethods()) {
            if (m.getName().startsWith("validar")
                    && m.getReturnType() == boolean.class
                    && m.getParameterTypes().length == 0) {
                Boolean retorno = (Boolean) m.invoke(obj);
                result = result && retorno;
            }
        }

        return result;
    }

    public static void testarObjeto(Object obj) throws Exception {
        Class<?> c = obj.getClass();
        for (Method m : c.getMethods()) {
            if (m.getName().startsWith("test")
                    && m.getReturnType() == void.class
                    && m.getParameterTypes().length == 0) {
                m.invoke(obj);
            }
        }
    }
}
