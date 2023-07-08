package questao04;

public class Main {

    public static void main(String[] args) {
       Moto moto = new Moto("Honda", "Vermelha", "100cc",2010,10000);
       System.out.println(moto);
       
       System.out.println("\n");
  
       Carro carro = new Carro("Mercedes","Branca","200 cavalos",2020,60000);
       System.out.println(carro);
       
       System.out.println("\n");
       
       Caminhao caminhao = new Caminhao("Volvo", "Preto","400 cavalos",2000,100000);
        System.out.println(caminhao);
    }
    
}
