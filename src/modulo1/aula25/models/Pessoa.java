package models;
//quando tem uma classe abstrata ela não deixa criar objeto
public abstract class Pessoa extends Base{ //herança
  public String nome;
  public Endereco enderecoResidencial; //composicao
  public Endereco enderecoComercial;  
}