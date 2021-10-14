package view;
import controller.ProdutoController;
import model.Produto;
import java.util.ArrayList;
//a view é responsável por chamar controllers para fazer o necessário
public class ProdutoView {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.nome = "TV";
        p.valor = 1988.90;

        // essa controler tem métodos e está preparada para fazer o que está sendo solicitado
        ProdutoController controller = new ProdutoController(); 
        controller.salvar(p);

        ArrayList<Produto> prods = controller.listar();

        for (Produto prodSalvo : prods) {
            System.out.println(prodSalvo.nome);
            System.out.println(prodSalvo.valor);         
        }
    }
}
