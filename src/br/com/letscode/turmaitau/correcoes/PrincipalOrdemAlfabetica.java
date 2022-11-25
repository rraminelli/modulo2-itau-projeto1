package br.com.letscode.turmaitau.correcoes;

import java.util.Arrays;
import java.util.List;

public class PrincipalOrdemAlfabetica {
    public static void main(String[] args) {

        Integer comparedResult;
        List<String> listaStrings;
        int contadorSequencia = 0;
        int[] qtdsequencias = new int [10];
        //String sequenciaAlfabetica = "";
        String maiorSequencia = "";
        String letra;
        String proximaLetra;
        int posmaiorSequencia=0;


        String[] strings = {"acbda", "fasdlkh", "poiwqd", "zxcqwtop", "xqfgxophl"};

        listaStrings = Arrays.asList(strings);

        int tamLista = strings.length;

        for (int i = 0; i < tamLista; i++) {
            contadorSequencia =0;

            StringBuilder sequenciaAlfabetica = new StringBuilder("");

            System.out.println("Análise String: " + listaStrings.get(i) +" posição " +i);
            int tamString = 0;
            tamString = listaStrings.get(i).length();


            for (int j = 0; j < tamString -1 ; j++) {
                int posletra = (int) listaStrings.get(i).charAt(j);
                int posproximaletra = (int)  listaStrings.get(i).charAt(j+1);

                letra = String.valueOf(listaStrings.get(i).charAt(j));
                proximaLetra = String.valueOf(listaStrings.get(i).charAt(j+1));

                    if (posletra == posproximaletra-1) {
                        contadorSequencia++;
                        sequenciaAlfabetica.append(letra);
                        sequenciaAlfabetica.append(proximaLetra);
                        sequenciaAlfabetica.append(" ");
                    }
            }

            qtdsequencias[i] = contadorSequencia;

            if (i>0){
                if (qtdsequencias[i] > qtdsequencias[i-1]){
                    maiorSequencia = sequenciaAlfabetica.toString();
                    posmaiorSequencia = i;
                }
            }
        }

        System.out.println( "RESULTADO DAS ANÁLISES_ \nMaior sequencia alfabetica: " + maiorSequencia + " na string : " + listaStrings.get(posmaiorSequencia));

    }

}