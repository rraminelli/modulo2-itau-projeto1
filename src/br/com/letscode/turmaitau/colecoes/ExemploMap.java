package br.com.letscode.turmaitau.colecoes;

import java.util.*;

public class ExemploMap {

    public static void main(String[] args) {

        Map<String, String> cidades = new LinkedHashMap<>();
        cidades.put("SP", "Sao Paulo");
        cidades.put("CA", "Campinas");
        cidades.put("CT", "Curitiba");
        cidades.put("RJ", "Rio de Janeiro");
        cidades.put("SP", "Sao Paulo");
        cidades.put("CA", "Campinas");
        cidades.put("CP", "Campinas");

        cidades.put("CP","Campinas 2");

        List<String> cidadesList = new ArrayList<>();

        for (String chaveCidade: cidades.keySet()) {
            String nomeCidade = cidades.get(chaveCidade);
            System.out.println(chaveCidade + " - " + nomeCidade);

            cidadesList.add(nomeCidade);
        }

        cidades.forEach((chave, valor) ->
                System.out.println(chave + " - " + valor));

        Collections.sort(cidadesList);

        System.out.println("for tradicional");
        for (int i=0; i < cidadesList.size(); i++) {
            String nomeCidade = cidadesList.get(i);
            System.out.println(nomeCidade);
        }

        System.out.println("foreach");
        for (String nomeCidade: cidadesList) {
            System.out.println(nomeCidade);
        }

        System.out.println("foreach lambda 1");
        cidadesList.forEach(nomeCidade -> System.out.println(nomeCidade));

        System.out.println("foreach lambda 2");
        cidadesList.forEach(System.out::println);



        //cidades.forEach(System.out::println);

    }

}
