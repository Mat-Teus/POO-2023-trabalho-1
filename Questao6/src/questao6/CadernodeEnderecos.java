package questao6;

public class CadernodeEnderecos {
    //Atributos
    protected String nome, endereco, telefone, email, datadeniver;
    
    //Construtores
    public CadernodeEnderecos(String nome, String endereco, String telefone, String email, String datadeniver) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.datadeniver = datadeniver;
    }

    public CadernodeEnderecos() {
    }
    
    //Métodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDatadeniver() {
        return datadeniver;
    }

    public void setDatadeniver(String datadeniver) {
        this.datadeniver = datadeniver;
    }

    @Override
    public String toString() {
        return "\nnome:" + nome + "\nendereco:" + endereco + "\ntelefone:" + telefone + "\nemail:" + email + "\ndata de aniversario:" + datadeniver;
    }
}
