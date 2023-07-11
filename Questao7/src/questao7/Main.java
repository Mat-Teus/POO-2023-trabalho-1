package questao7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Movimentacao> movimentacoes = new ArrayList<>();
        Movimentacao m1 = new Movimentacao("Deposito para outra conta", -200,0);
        movimentacoes.add(m1);
        
        List<Movimentacao> movimentacoes2 = new ArrayList<>();
        Movimentacao m2 = new Movimentacao("Recebimento de outra conta", +200,0);
        movimentacoes2.add(m2);
        
        List<ContaCorrente> conta = new ArrayList<>();
        ContaCorrente c1 = new ContaCorrente(1,12000,30000,true,movimentacoes);
        ContaCorrente c2 = new ContaCorrente(2,2000,10000,false,movimentacoes2);
        conta.add(c1);conta.add(c2);
        
        Banco banco = new Banco(conta);
        banco.Saque(c1, 2000);
        System.out.println(banco);
        
        banco.Deposito(c1, 3000);
        System.out.println(banco);
        
        banco.TransfContasDep(c2, c1, 200);
        
        System.out.println(banco.getExtrato(c1));
        System.out.println(banco.getSaldo(c1));
        
        
        banco = new Banco();
        System.out.println(banco);
    }   
}
