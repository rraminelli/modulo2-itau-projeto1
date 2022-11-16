package br.com.letscode.turmaitau.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxMain {

    public static void main(String[] args) {

        //ERRO!!!
        /*Box box = new Box();
        box.inserirConteudo("1.0");
        box.imprimirConteudo();*/

        BoxGenerics<Double> boxGenerics = new BoxGenerics<>();
        boxGenerics.inserirConteudo(2.0);
        boxGenerics.imprimirConteudo();


        List<Integer> numeros = new ArrayList();

        List<String> nomes = new ArrayList();
        nomes.add("Alexandre");
        //public void add(T element);
        nomes.add("Neri");
        nomes.add("Diego");
        nomes.add("Carlas");


        for (String nome : nomes) {
            System.out.println(nome);
        }

        for (int i=0; i<nomes.size(); i++){
            String nome = nomes.get(i);
            System.out.println(nome);
        }

        imprimirListString(nomes);

    }

    public static void imprimirListString(List<? extends CharSequence> nomes) {

    }

    public <T extends Number> void imprimirValor(T valor) {

    }

}
