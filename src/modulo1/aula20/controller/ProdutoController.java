package controller;
import java.util.ArrayList;
import model.Produto;
//vai receber solicitações das view (controllers)
//poderia salvar no banco de dados 
//nesse caso, o controlador vai decidir o que fazer com os produtos
//controller sempre vai intermediar a view e a model, ela que vai decidir as coisas
public class ProdutoController {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public void salvar(Produto p){
        this.produtos.add(p);
    }

    public ArrayList<Produto> listar(){
        return produtos;
    }
    
}
