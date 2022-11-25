package br.com.letscode.turmaitau.interfaces;

@FunctionalInterface
public interface InterfaceMetodoImpl {

    void teste();


    //void teste2();

    default void metodoImpl() {
        System.out.println("teste");
    }

}
