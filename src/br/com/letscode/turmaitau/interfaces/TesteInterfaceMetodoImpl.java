package br.com.letscode.turmaitau.interfaces;

public class TesteInterfaceMetodoImpl implements InterfaceMetodoImpl{

    @Override
    public void teste() {

    }

    public void teste(String msg) {

    }

    @Override
    public void metodoImpl() {
        System.out.println("teste 2 - TesteInterfaceMetodoImpl");
        InterfaceMetodoImpl.super.metodoImpl();
    }

}
