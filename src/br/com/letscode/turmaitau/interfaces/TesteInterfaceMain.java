package br.com.letscode.turmaitau.interfaces;

import java.util.Arrays;

public class TesteInterfaceMain {

    public static void main(String[] args) {

        //PrimeiraInterface primeiraInterface = new PrimeiraInterface();

        InterfaceMetodoImpl interfaceMetodo = new TesteInterfaceMetodoImpl();
        interfaceMetodo.metodoImpl();


        TesteInterfaceMetodoImpl interfaceMetodo2 = new TesteInterfaceMetodoImpl();
        interfaceMetodo2.teste("mensagem");


        InterfaceMetodoImpl interfaceMetodoFuncional = () -> System.out.println("chamando o metodo teste");
        interfaceMetodoFuncional.teste();

    }

}
