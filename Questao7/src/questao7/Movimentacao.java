package questao7;

public class Movimentacao {
    //Atributos
    private String desc;
    private int valor,info;
    
    //Construtores
    public Movimentacao(String desc, int valor, int info) {
        this.desc = desc;
        this.valor = valor;
        this.info = info;
    }

    public Movimentacao() {
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getInfo() {
        if(info>=1){
        return "Movimentacao de Credito";
        }else{
        return "Movimentacao de Debito";
        }
    }

    public void setInfo(int info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Movimentacao:" + "descricao:" + desc + ", valor:" + valor + ", info:" + getInfo();
    }
    
    
}