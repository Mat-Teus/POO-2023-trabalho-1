package questao5;

public class Data {
   //Atributos
    protected int dia,mes,ano;
    
    //Construtores
    public Data(int dia, int mes, int ano){
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
    }
    
    public Data(){
    this(0,0,0);
    }
    
    //Métodos
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String ExibeData(){
    return dia+"/"+mes+"/"+ano;
    }
}