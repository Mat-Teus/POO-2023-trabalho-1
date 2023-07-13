package questao9;

import java.time.LocalDate;
import java.time.Period;

public class EntradaDeCinema {
    // Atributos
    private LocalDate dataDoFilme;
    private String horario;
    private String sala;
    private double valor;

    // Construtor
    public EntradaDeCinema(LocalDate dataDoFilme, String horario, String sala, double valor) {
        this.dataDoFilme = dataDoFilme;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
    }

    // Métodos
    public void calculaDesconto(LocalDate dataNascimento) {
        int idade = calcularIdade(dataNascimento);

        if (idade < 12) {
            valor *= 0.5;
        } else if (idade >= 12 && idade <= 15) {
            valor *= 0.6;
        } else if (idade >= 16 && idade <= 20) {
            valor *= 0.7;
        } else if (idade > 20) {
            valor *= 0.8;
        }
    }

    public void calculaDescontoHorario() {
        int hora = Integer.parseInt(horario.substring(0, 2));

        if (hora < 16) {
            valor *= 0.9;
        }
    }
    private int calcularIdade(LocalDate dataNascimento) {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje);
        return periodo.getYears();
    }

    @Override
    public String toString() {
        return "Data do Filme: " + dataDoFilme + "\nHorario: " + horario + "\nSala: " + sala + "\nValor: R$" + valor;
    }
}
