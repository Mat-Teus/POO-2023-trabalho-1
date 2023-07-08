package questao04;

public class Moto extends Veiculo{
    //Atributos
    private static final int duasrodas = 2;
    private static final char tamanho = 'P';
    private String marca;
    
    //Métodos
    public Moto(String marca, String cor, String potencia, int anodefab, int valor) {
        super(cor, potencia, anodefab, valor);
        this.marca = marca;
    }
    
    public Moto(){}
    
    //Métodos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Moto:" + "\ncor:" + cor + "\npotencia:" + potencia + "\nano de fabricacao:" + anodefab + "\nvalor:" + valor + "\nmarca:" + marca + "\nNumero de rodas:" + duasrodas + "\nTamanho:" + tamanho;
    }
    
    
}
