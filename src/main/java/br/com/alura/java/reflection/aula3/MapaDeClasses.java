package br.com.alura.java.reflection.aula3;

import java.lang.reflect.Constructor;

public class MapaDeClasses extends br.com.alura.java.reflection.aula2.MapaDeClasses {

    public Object getObject(String key) throws Exception {
        return getClass(key).newInstance();
    }

    public Object getObject(String key, Object... params) throws Exception {
        Class[] types = new Class[params.length];
        for (int i = 0; i < types.length; i++) {
            types[i] = params[i].getClass();
        }
        Constructor constructor = getClass(key).getConstructor(types);
        return constructor.newInstance(params);
    }

}
