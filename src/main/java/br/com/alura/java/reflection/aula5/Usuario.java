package br.com.alura.java.reflection.aula5;

public class Usuario extends br.com.alura.java.reflection.aula4.Usuario {

    public boolean validarEmail() {
        return getEmail().contains("@");
    }

    public boolean validarSenha() {
        return getSenha().length() > 8;
    }

    public void testarEmail() {
        System.out.println("br.com.alura.java.reflection.aula5.Usuario.testarEmail()");
    }

    public void testarSenha() {
        System.out.println("br.com.alura.java.reflection.aula5.Usuario.testarSenha()");
    }
}
