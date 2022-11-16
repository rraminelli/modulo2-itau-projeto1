package br.com.letscode.turmaitau.colecoes;

import java.util.List;

public record PessoaRecord(
        String nome,
        String sobrenome,
        String telefone,
        List<String> emails) {

}
