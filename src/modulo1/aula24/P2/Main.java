package P2;

import P2.Controllers.AlunoController;
import P2.Controllers.PessoaController;
import P2.Model.Aluno;
import P2.Model.Pessoa;


public class Main {
    PessoaController PessoaController = new PessoaController();
    AlunoController alunoController = new AlunoController();

    Pessoa p1 = new Pessoa();
    p1.nome = "Melissa";
    p1.sobrenome = "Matos";
    p1.idade = 23;

    Aluno a1 = new Aluno();
    a1.nome = "Jussara";
    a1.sobrenome = "Araújo";
    a1.idade = 22;
    a1.matricula = "1919929202";
    a1.turma = "A";
    a1.curso = "Física";

    pessoaController.create(p1);
    alunoController.create(a1);

    Pessoa p2 = new Pessoa();
    p2.nome = "Melissa";
    p2.sobrenome = "Matos";
    p2.idade = 23;

    System.out.println(pessoaController.existe(p2));

    alunoController.delete(a1);
    System.out.println(alunoController.existe(a1));
}
