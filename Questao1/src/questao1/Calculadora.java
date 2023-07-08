package questao1;

import java.text.DecimalFormat;

public abstract class Calculadora {
    //Atributos
    protected int a,b;
    DecimalFormat df = new DecimalFormat("0.00");
    
    //Construtores
    public Calculadora(int a, int b){
    this.a = a;
    this.b = b;
    }
    
    public Calculadora(){
    this(0,0);
    }
    
    //Métodos
    public void setA(int a){this.a = a;}
    public void setB(int b){this.b = b;}
    
    public int getA(){return a;}
    public int getB(){return b;}
    
    public int getSoma(){
    return a+b;
    }
    
    public int getSub(){
    return a-b;
    }
    
    public int getMult(){
    return a*b;
    }
    
    public double getDiv(){
    return (double)a/b;
    }
    
    @Override
    public String toString(){
    return "A:"+a+"\nB:"+b+"\nSoma de A+B:"+getSoma()+"\nSubtracao:"+getSub()+"\nMultiplicacao:"+getMult()+"\nDivisao:"+df.format(getDiv());
    }
}
