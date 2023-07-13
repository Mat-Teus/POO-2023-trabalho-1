
package questao7;

import java.util.ArrayList;
import java.util.List;

public class Contas {
     // Atributos
    private final int numero;
    private double saldo;
    private final boolean especial;
    private final double limite;
    private final List<Movimentacao> movimentacoes;

    // Construtor
    public Contas(int numero, double saldo, boolean especial, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
        this.movimentacoes = new ArrayList<>();
    }

    // Métodos
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public double getLimite() {
        return limite;
    }

    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    public void adicionarMovimentacao(Movimentacao movimentacao) {
        movimentacoes.add(movimentacao);
    }

    public void realizarSaque(double valor) {
        double limiteSaque = especial ? limite : 0;
        if (saldo - valor >= -limiteSaque) {
            saldo -= valor;
            Movimentacao movimentacao = new Movimentacao("Saque", valor, Movimentacao.Tipo.DEBITO);
            adicionarMovimentacao(movimentacao);
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void realizarDeposito(double valor) {
        saldo += valor;
        Movimentacao movimentacao = new Movimentacao("Depósito", valor, Movimentacao.Tipo.CREDITO);
        adicionarMovimentacao(movimentacao);
        System.out.println("Depósito realizado com sucesso.");
    }

    public void emitirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public void emitirExtrato() {
        System.out.println("Extrato:");
        for (Movimentacao movimentacao : movimentacoes) {
            System.out.println(movimentacao.toString());
        }
    }

    public void transferir(Contas destino, double valor) {
        if (saldo - valor >= -limite) {
            saldo -= valor;
            Movimentacao movimentacaoDebito = new Movimentacao("Transferência para conta " + destino.getNumero(), valor, Movimentacao.Tipo.DEBITO);
            adicionarMovimentacao(movimentacaoDebito);

            destino.saldo += valor;
            Movimentacao movimentacaoCredito = new Movimentacao("Transferência da conta " + numero, valor, Movimentacao.Tipo.CREDITO);
            destino.adicionarMovimentacao(movimentacaoCredito);

            System.out.println("Transferência realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }

}
