package questao2;

public class Aluno extends Pessoa{
    //Atributos
    String curso, disciplina;
    
    //Construtores
    public Aluno(){}

    public Aluno(String curso, String disciplina, String nome, String cpf, String idade) {
        super(nome, cpf, idade);
        this.curso = curso;
        this.disciplina = disciplina;
    }
    
    //Métodos

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Aluno:" + "\nnome=" + nome + "\nidade=" +idade + "\ncpf=" + cpf + "\ncurso=" + curso + "\ndisciplina=" + disciplina;
    }
}
