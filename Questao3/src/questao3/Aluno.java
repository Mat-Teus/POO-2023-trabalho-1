package questao3;

import java.util.List;

public class Aluno extends Pessoa {
    //Atributos
    private String curso;
    private List<Disciplina> disciplina;
    
    //Construtores
    public Aluno(){}

    public Aluno(String curso, List<Disciplina> disciplina, String nome, String cpf, String idade) {
        super(nome, cpf, idade);
        this.curso = curso;
        this.disciplina = disciplina;
    }

    //Métodos
    public List<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return  "\nAluno:" + super.toString() + "\ncurso:" + curso + "\ndisciplina:" + disciplina;
    }
}
