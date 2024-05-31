package org.Entitys.Clientes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@AllArgsConstructor
public class ClientePJ extends Cliente {
    protected String CNPJ;

    public ClientePJ(String nome, String CNPJ) {
        super.nome = nome;
        this.CNPJ = CNPJ;
    }
    @Override
    public void imprimirCliente() {
        super.imprimirCliente();
        System.out.println("CNPJ: " + CNPJ);
    }
}
