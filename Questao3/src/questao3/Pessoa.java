package questao3;

public abstract class Pessoa {
    //Atributos
    protected String nome,cpf,idade;
    
    //Construtores
    public Pessoa(){}
    
    public Pessoa(String nome, String cpf, String idade){
    this.nome = nome;
    this.cpf = cpf;
    this.idade = idade;
    }
    
    //Métodos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "\nnome:" + nome + "\ncpf:" + cpf + "\nidade:" + idade;
    }
}
