package controller;
import model.Pessoa;
import dao.PessoaDao;
public class PessoaController extends BaseController<Pessoa>{
    public PessoaController(){
        super(new PessoaDao());
    }
}