package br.com.alura.java.reflection.aula5;

public class Principal {
    
    public static void main(String[] args) throws Exception {
        Usuario u = new Usuario();
        u.setEmail("sem@arroba.com");
        u.setSenha("123456789");
        
        boolean valido = Validador.validarObjeto(u);
        if(valido) {
            System.out.println("O objeto é válido");
        } else {
            System.out.println("O objeto é inválido");
        }
        
        Validador.testarObjeto(u);
    }
    
}
