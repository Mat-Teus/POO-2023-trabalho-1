package questao8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    Pais brasil = new Pais("Brasil", "Brasilia", "Grande");
    Pais argentina = new Pais("Argentina", "Buenos Aires", "Grande");
    Pais uruguai = new Pais("Uruguai", "Montevideu", "Pequena");

    List<Pais> fronteiraBrasil = new ArrayList<>();
    fronteiraBrasil.add(argentina);
    fronteiraBrasil.add(uruguai);
    brasil.setFronteira(fronteiraBrasil);

    List<Pais> fronteiraArgentina = new ArrayList<>();
    fronteiraArgentina.add(brasil);
    fronteiraArgentina.add(uruguai);
    argentina.setFronteira(fronteiraArgentina);

    List<Pais> fronteiraUruguai = new ArrayList<>();
    fronteiraUruguai.add(brasil);
    fronteiraUruguai.add(argentina);
    uruguai.setFronteira(fronteiraUruguai);

    List<Pais> paisesEmComum = brasil.checkFronteira(argentina);
    List<Pais> paisesEmComum2 = brasil.checkFronteira(uruguai);
    List<Pais> paisesEmComum3 = argentina.checkFronteira(uruguai);

    System.out.println("Paises em comum entre Brasil e Argentina:" + "\n" + paisesEmComum);
    System.out.println("\nPaises em comum entre Brasil e Uruguai:" + "\n" + paisesEmComum2);
    System.out.println("\nPaises em comum entre Argentina e Uruguai:" + "\n" + paisesEmComum3);
   }
}
