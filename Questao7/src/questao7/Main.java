package questao7;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.criarConta(1, 1000.0, false, 500.0);
        banco.criarConta(2, 500.0, true, 1000.0);
        banco.criarConta(3, 2000.0, false, 0.0);

        banco.realizarSaque(1, 700.0); 
        banco.realizarSaque(2, 1500.0); 
        banco.realizarSaque(4, 500.0); 

        banco.realizarDeposito(1, 350.0); 
        banco.realizarDeposito(3, 1500.0); 
        banco.realizarDeposito(5, 600.0); 

        banco.emitirSaldo(1); 
        banco.emitirExtrato(2); 
        banco.emitirExtrato(3); 

        banco.transferir(1, 2, 200.0); 
        banco.transferir(3, 1, 2200.0); 
        banco.transferir(4, 2, 250.0); 

        banco.excluirConta(3); 
        banco.excluirConta(5); 
    }
    
}
