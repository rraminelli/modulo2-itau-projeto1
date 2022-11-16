package br.com.letscode.turmaitau.colecoes;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploSet {

    public static void main(String[] args) {

        Set<String> cidades = new LinkedHashSet<>();
        cidades.add("Sao Paulo");
        cidades.add("Campinas");
        cidades.add("Curitiba");
        cidades.add("Rio de Janeiro");
        cidades.add("Sao Paulo");
        cidades.add("Campinas");

        for (String nomeCidade: cidades) {
            System.out.println(nomeCidade);
        }

        Stream<String> sorted = cidades.stream().sorted();
        List<String> cidadesOrdenadas = sorted.collect(Collectors.toList());

        List cidadesList = Arrays.asList(cidades.toArray());
        Collections.sort(cidadesList, Collections.reverseOrder());
        //Collections.reverse(cidadesList);

    }

}
