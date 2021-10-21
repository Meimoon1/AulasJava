package P2.Controllers;
import java.util.ArrayList;
import P2.Model.Aluno;

public class AlunoController{
    private ArrayList<Aluno> dados;

    public AlunoController(){
        this.dados = new ArrayList<Aluno>();
    }

    public int numItens(){
        return dados.size();
    }

    public void create(Aluno obj){
        this.dados.add(obj);
    }

    public void delete(Aluno obj){
        this.dados.remove(obj);
    }

    public void update(Aluno obj){
        if(existe(obj)){
            this.delete(obj);
            this.create(obj);
        }
    }

    public boolean existe(Aluno obj){
        return this.dados.contains(obj);
    }
    
}
