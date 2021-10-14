package P1;
public class Pessoa{
    private String nome;
    
    public void setNome(){
        this.nome = nome;
    }

    @Override
    public String toString(){
        String mensagem = "Classe Pessoa - "+ this.nome;
        return mensagem;
    }
}
