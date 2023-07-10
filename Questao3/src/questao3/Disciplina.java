package questao3;

public class Disciplina {
    //Atributos
    private String disciplina;
    
    //Construtores
    public Disciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    public Disciplina() {
    }
    
    //Métodos
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return disciplina;
    }
}
