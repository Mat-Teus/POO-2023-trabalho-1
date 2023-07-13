package questao7;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    // Atributos
    private final List<Contas> contas;

    // Construtor
    public Banco() {
        this.contas = new ArrayList<>();
    }

    // Métodos
    public void criarConta(int numero, double saldoInicial, boolean especial, double limite) {
        Contas conta = new Contas(numero, saldoInicial, especial, limite);
        contas.add(conta);
        System.out.println("Conta criada com sucesso.");
    }

    public void excluirConta(int numero) {
        Contas conta = buscarConta(numero);
        if (conta != null) {
            contas.remove(conta);
            System.out.println("Conta excluída com sucesso.");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void realizarSaque(int numeroConta, double valor) {
        Contas conta = buscarConta(numeroConta);
        if (conta != null) {
            conta.realizarSaque(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void realizarDeposito(int numeroConta, double valor) {
        Contas conta = buscarConta(numeroConta);
        if (conta != null) {
            conta.realizarDeposito(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void emitirSaldo(int numeroConta) {
        Contas conta = buscarConta(numeroConta);
        if (conta != null) {
            conta.emitirSaldo();
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void emitirExtrato(int numeroConta) {
        Contas conta = buscarConta(numeroConta);
        if (conta != null) {
            conta.emitirExtrato();
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void transferir(int numeroContaOrigem, int numeroContaDestino, double valor) {
        Contas contaOrigem = buscarConta(numeroContaOrigem);
        Contas contaDestino = buscarConta(numeroContaDestino);
        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.transferir(contaDestino, valor);
        } else {
            System.out.println("Conta de origem ou conta de destino não encontrada.");
        }
    }

    private Contas buscarConta(int numero) {
        for (Contas conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }
}
