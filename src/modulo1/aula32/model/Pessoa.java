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
}
