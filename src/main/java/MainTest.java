import org.Entitys.Clientes.Cliente;
import org.Entitys.Clientes.ClientePF;
import org.Entitys.Contas.ContaCorrente;
import org.Entitys.Contas.ContaPoupanca;

public class MainTest {

    public static void main(String[] args) {

        ClientePF cliente = new ClientePF("Leandro Alves", "12345678910");

        ContaCorrente cc = new ContaCorrente(cliente);
        cc.depositar(100.00);
        ContaPoupanca cp = new ContaPoupanca(cliente);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println();
        cc.transferir(50.00, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
