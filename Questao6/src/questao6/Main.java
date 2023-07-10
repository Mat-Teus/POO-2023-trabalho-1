package questao6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CadernodeEnderecos cd1 = new CadernodeEnderecos("Fulano","Rua 1","0000","@mail","01/01/2001");
        CadernodeEnderecos cd2 = new CadernodeEnderecos("Ciclano","Rua 2","0002","@mail2","01/02/2001");
        CadernodeEnderecos cd3 = new CadernodeEnderecos("Outrano","Rua 3","0003","@mail3","01/03/2001");
        
        List<CadernodeEnderecos> caderneta = new ArrayList<>();
        caderneta.add(cd1);caderneta.add(cd2);caderneta.add(cd3);
        
        Moradores moradores = new Moradores(caderneta);
        
        System.out.println(moradores);
    }
    
}
