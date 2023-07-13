package questao7;

import java.util.ArrayList;
import java.util.List;

public class Movimentacao {
     // Atributos
    private final String descricao;
    private final double valor;
    private final Tipo tipo;

    // Construtor
    public Movimentacao(String descricao, double valor, Tipo tipo) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    // Métodos
    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        String tipoStr = tipo == Tipo.DEBITO ? "Débito" : "Crédito";
        return descricao + " - " + tipoStr + ": " + valor;
    }

    public enum Tipo {
        DEBITO,
        CREDITO
    }
}
