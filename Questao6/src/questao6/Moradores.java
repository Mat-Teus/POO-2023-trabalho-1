package questao6;

import java.util.List;

public class Moradores {
    //Atributos
    private List<CadernodeEnderecos> cad;
    
    //Construtores
    public Moradores(List<CadernodeEnderecos> cad) {
        this.cad = cad;
    }

    public Moradores() {
    }
    
    //Métodos
    public List<CadernodeEnderecos> getCad() {
        return cad;
    }

    public void setCad(List<CadernodeEnderecos> cad) {
        this.cad = cad;
    }

    @Override
    public String toString() {
        return "Moradores:\n" + cad;
    } 
}
