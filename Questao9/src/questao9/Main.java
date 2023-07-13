package questao9;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate dataFilme = LocalDate.of(2023, 7, 12);
        String horarioFilme = "15:30";
        String salaFilme = "Sala 1";
        double valorIngresso = 50.0;
        EntradaDeCinema entrada = new EntradaDeCinema(dataFilme, horarioFilme, salaFilme, valorIngresso);

        LocalDate dataNascimentoCliente = LocalDate.of(2010, 4, 5); // Exemplo de data de nascimento (ano, mês, dia)
        entrada.calculaDesconto(dataNascimentoCliente);
        entrada.calculaDescontoHorario();

        System.out.println(entrada);
    }
    
}
