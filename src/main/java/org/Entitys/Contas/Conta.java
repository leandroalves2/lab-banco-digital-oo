package org.Entitys.Contas;

import lombok.Getter;
import org.Entitys.Clientes.Cliente;
import org.Interfaces.IConta;

@Getter
public class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        this.saldo+= valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo-= valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        infoComunsExtrato();
    }

    private void infoComunsExtrato(){
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Numero da conta: " + this.numero);
        System.out.println("Saldo atual: " + this.saldo);
    }
}
