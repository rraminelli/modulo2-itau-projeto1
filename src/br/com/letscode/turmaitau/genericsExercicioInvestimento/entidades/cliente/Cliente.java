package br.com.letscode.turmaitau.genericsExercicioInvestimento.entidades.cliente;

import br.com.letscode.turmaitau.genericsExercicioInvestimento.entidades.investimento.Investimento;
import br.com.letscode.turmaitau.genericsExercicioInvestimento.entidades.perfil.ClientePerfil;

public abstract class Cliente<T extends ClientePerfil, U extends Investimento> {


    public void contratarInvestimento(U investimento) {
        System.out.println("contratando = " + investimento.getClass());
    }


}
