package br.com.letscode.turmaitau.colecoes;

import java.util.ArrayList;

public class ExemploRecords {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("nome da pessoa");

        PessoaRecord rodrigo = new PessoaRecord(
                "rodrigo",
                "",
                "",
                new ArrayList<>());

        rodrigo.nome();

    }

}
