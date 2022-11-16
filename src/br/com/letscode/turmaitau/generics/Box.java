package br.com.letscode.turmaitau.generics;

public class Box {

    private Object conteudo;

    public void inserirConteudo(Object conteudo) {
        Number number = (Number) conteudo;
        if (number.doubleValue() < 0) {
            throw new RuntimeException("Erro numero negativo");
        }
        this.conteudo = conteudo;
    }

    public void imprimirConteudo() {
        System.out.println(this.conteudo.toString());
    }

}
