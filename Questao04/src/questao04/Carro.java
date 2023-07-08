package questao04;

public class Carro extends Veiculo{
    //Atributos
    private static final int numrodas = 4;
    private static final char tamanho = 'M';
    private String marca;
    
    //Construtores

    public Carro(String marca, String cor, String potencia, int anodefab, int valor) {
        super(cor, potencia, anodefab, valor);
        this.marca = marca;
    }

    public Carro() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String toString() {
        return "Carro:" + "\ncor:" + cor + "\npotencia:" + potencia + "\nano de fabricacao:" + anodefab + "\nvalor:" + valor + "\nmarca:" + marca + "\nNumero de rodas:" + numrodas + "\nTamanho:" + tamanho;
    }
}
