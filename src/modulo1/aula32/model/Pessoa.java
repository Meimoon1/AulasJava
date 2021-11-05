package model;

public class Pessoa extends BaseModel{
    public String nome;
    public String sobrenome;

    @Override
    public String toString() {
        //string format é igual o printf
        String retorno = String.format("%s, %s,%s", 
            super.toString(),
            this.nome,
            this.sobrenome);
        return retorno;
    }

    public Pessoa(String pessoaString){
        String[] dados = pessoaString.split(";");
        this.id = Integer.parseInt(dados[0]);
        this.nome = dados[1];
        this.sobrenome = dados[2];
    }

}   
