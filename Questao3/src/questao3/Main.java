package questao3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Disciplina d1 = new Disciplina("Matematica");
        Disciplina d2 = new Disciplina("Portugues");
        
        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(d1);disciplinas.add(d2);
        
        Aluno aluno = new Aluno("Qualquer",disciplinas,"Fulano","123","20");
        System.out.println(aluno);
    }
}
