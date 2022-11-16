package br.com.letscode.turmaitau.generics;

public class BoxGenerics<T extends Number> {

    private T conteudo;

    public void inserirConteudo(T conteudo) {
        if (conteudo.doubleValue() < 0) {
            throw new RuntimeException("Erro numero negativo");
        }
        this.conteudo = conteudo;
    }

    public void imprimirConteudo() {
        System.out.println(this.conteudo.toString());
    }

}
