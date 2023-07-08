package questao04;

public class Veiculo {
    //Atributos
    protected String cor, potencia;
    protected int anodefab,valor;
    
    //Construtores

    public Veiculo(String cor, String potencia, int anodefab, int valor) {
        this.cor = cor;
        this.potencia = potencia;
        this.anodefab = anodefab;
        this.valor = valor;
    }

    public Veiculo() {
    }
    
    //Métodos

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getAnodefab() {
        return anodefab;
    }

    public void setAnodefab(int anodefab) {
        this.anodefab = anodefab;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Veiculo:" + "\ncor:" + cor + "\npotencia:" + potencia + "\nano de fabricacao:" + anodefab + "\nvalor:" + valor;
    }
}
