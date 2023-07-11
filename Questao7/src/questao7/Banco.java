package questao7;

import java.util.List;

public class Banco {
    //Atributo
    private List<ContaCorrente> contas;
    private ContaCorrente conta;

    //Construtores
    public Banco(List<ContaCorrente> contas) {
        this.contas = contas;
    }

    public Banco() {
    }
    
    //Métodos
    public void Saque(ContaCorrente conta, int valor){
        if(conta.getSaldo()>0 && valor<conta.getSaldo() + conta.getLimite()){
        conta.setSaldo(conta.getSaldo() - valor);
        }
    }
    
    public void Deposito(ContaCorrente conta, int valor){
        conta.setSaldo(conta.getSaldo() + valor);
    }
    
    public void TransfContasDep(ContaCorrente conta1, ContaCorrente conta2, int valor){
        conta2.setSaldo(conta2.getSaldo()+valor);
        conta1.setSaldo(conta1.getSaldo()-valor);
    }
    
    public String getSaldo(ContaCorrente conta){
        return "Seu saldo:" + conta.getSaldo();
    }
    
    public String getExtrato(ContaCorrente conta){
        return "Extrato:" + conta.getMovimentacoes();
    }
    
    @Override
    public String toString() {
        return "Banco:" + " contas:" + contas;
    }
}
