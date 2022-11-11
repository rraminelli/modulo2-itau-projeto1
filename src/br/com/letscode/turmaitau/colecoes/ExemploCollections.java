package br.com.letscode.turmaitau.colecoes;

import java.math.BigDecimal;
import java.util.*;

public class ExemploCollections {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("Adriano");
        list.add("Vladimir");
        list.add("Zaira");
        list.add("Carlas");
        list.add("Guilherme");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collection<Pessoa> pessoas = new HashSet();
        pessoas.add(new Pessoa("Adriano"));
        pessoas.add(new Pessoa("Vladimir"));
        pessoas.add(new Pessoa("Zaira"));
        pessoas.add(new Pessoa("Carlas"));
        pessoas.add(new Pessoa("Guilherme"));
        pessoas.add(new Pessoa("Almir"));
        pessoas.add(new Pessoa("Monica"));
        pessoas.add(new Pessoa("Monica"));

        //pessoas.add("Bruna");
        //pessoas.add(new Integer("1"));
        //pessoas.add(BigDecimal.ONE);

        System.out.println(pessoas);

        List pessoasList = Arrays.asList(pessoas.toArray());
        ordenacao(pessoasList);
        System.out.println(pessoasList);

        /*Pessoa pessoa = new Pessoa("Diego");
        pessoa.compareTo(new Pessoa("Diego"));*/



    }

    public static void ordenacao(List<? extends Ordenacao> pessoasList) {
        Collections.sort(pessoasList);
    }

}
