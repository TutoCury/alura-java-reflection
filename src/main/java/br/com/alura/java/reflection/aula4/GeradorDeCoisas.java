package br.com.alura.java.reflection.aula4;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class GeradorDeCoisas {

    public static String getXML(Object obj) throws Exception {
        StringBuilder sb = new StringBuilder();

        Class<?> c = obj.getClass();
        sb.append("<").append(c.getSimpleName()).append("> \n");

        for (Field f : c.getDeclaredFields()) {
            sb.append("<").append(f.getName()).append(">");
            f.setAccessible(true);
            sb.append(f.get(obj));
            sb.append("</").append(f.getName()).append("> \n");
        }

        sb.append("</").append(c.getSimpleName()).append("> \n");
        return sb.toString();
    }

    public static Map<String, Object> getMap(Object obj) throws Exception {
        Map<String, Object> map = new HashMap<>();

        Class<?> c = obj.getClass();
        for (Field f : c.getDeclaredFields()) {
            f.setAccessible(true);
            map.put(f.getName(), f.get(obj));
        }

        return map;
    }

}
