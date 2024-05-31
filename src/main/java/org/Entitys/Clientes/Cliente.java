package org.Entitys.Clientes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {

    protected String nome;

    public void imprimirCliente(){
        this.dadosBasicos();
    }

    private void dadosBasicos(){
        System.out.println("Nome: " + nome);
    }

}
