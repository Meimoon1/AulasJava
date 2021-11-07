package dao;
import model.Pessoa;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;


public class PessoaDao extends BaseDao<Pessoa>{
    public PessoaDao(){
        super("dados/pessoa.csv");
    }

    public ArrayList<Object> list(){
        ArrayList<Object> pessoas = new ArrayList<Object>();
        try {
            Scanner sc = new Scanner(new File(this.filename));
            //esse hasnext line , verifica se tem mas alguma linha pra ler
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                Pessoa p = new Pessoa(linha);
                pessoas.add(p);      
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return pessoas;
    }
    @Override
    public void update(Pessoa model) {

        
    }

    @Override
    public void remove(Pessoa model) {

        
    }
  
}
