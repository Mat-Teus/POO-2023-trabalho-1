package questao1;

public class CalculadoraCompleta extends Calculadora{
    //Métodos
    public int getPot(){
    return a*a;
    }
    
    public double getRaiz(){
    return Math.sqrt(a);
    }
    
    @Override
    public String toString(){
    return "A:"+a+"\nB:"+b+"\nSoma de A+B:"+getSoma()+"\nSubtracao:"+getSub()+"\nMultiplicacao:"+getMult()+"\nDivisao:"+df.format(getDiv())+"\nPotenciacao:"+getPot()+"\nRaiz Quadrada:"+df.format(getRaiz());
    }
}
