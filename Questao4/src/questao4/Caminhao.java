package questao4;

public class Caminhao extends Veiculo{
    //Atributos
    private static final int rodas = 4;
    private static final char tamanho = 'G';
    private String marca;
    
    //Construtores
    public Caminhao(String marca, String cor, String potencia, int anodefab, int valor) {
        super(cor, potencia, anodefab, valor);
        this.marca = marca;
    }

    public Caminhao() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String toString() {
        return "Caminhao:" + "\ncor:" + cor + "\npotencia:" + potencia + "\nano de fabricacao:" + anodefab + "\nvalor:" + valor + "\nmarca=" + marca + "\nNumero de rodas:" + rodas + "\nTamanho:" + tamanho;
    }
}
