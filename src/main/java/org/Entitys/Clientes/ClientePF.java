package org.Entitys.Clientes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class ClientePF extends Cliente {
    protected String CPF;

    public ClientePF(String nome, String CPF) {
        super.nome = nome;
        this.CPF = CPF;
    }

    @Override
    public void imprimirCliente() {
        super.imprimirCliente();
        System.out.println("CPF: " + CPF);
    }
}