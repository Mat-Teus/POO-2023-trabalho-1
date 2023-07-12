package questao8;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    //Atributos
    private String nome, capital, dimensao;
    private List<Pais> fronteira;
    
    //Construtores
    public Pais(String nome, String capital, String dimensao) {
        this.nome = nome;
        this.capital = capital;
        this.dimensao = dimensao;
    }

    public Pais() {
    }
    
    //Métodos
    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }

    public String getDimensao() {
        return dimensao;
    }
    
    public boolean equals(final Pais outro){
        if((this.getNome()==outro.getNome()) && (this.getCapital()==outro.capital)){
        return true;
        }else{
        return false;
        }
    }

    public void setFronteira(List<Pais> fronteira) {
        this.fronteira = fronteira;
    }

    public List<Pais> getFronteira() {
        return fronteira;
    }
    
    public List<Pais> checkFronteira(Pais outro) {
    List<Pais> vizinhosComuns = new ArrayList<>();
    if (fronteira != null && outro.getFronteira() != null) {
        for (Pais paisFronteira : fronteira) {
            if (outro.getFronteira().contains(paisFronteira)) {
                vizinhosComuns.add(paisFronteira);
            }
        }
    }
    return vizinhosComuns;
}

    @Override
    public String toString() {
        return "Nome:" + nome + "\nCapital:" + capital + "\nDimensao:" + dimensao + '\n';
    }
}
