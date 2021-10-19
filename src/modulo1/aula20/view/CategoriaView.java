package view;
import model.Categoria;
import controller.CategoriaController;

public class CategoriaView{
    public static void main(String[] args) {
        CategoriaController controller = new CategoriaController();

        Categoria categoria1 = new Categoria();
        categoria1.nome = "Televisões";
        categoria1.descricao = "Tvs de 32 polegadas";

        controller.salvar(categoria1);

        for (Categoria cat : controller.listar()){
            System.out.println(categoria1.nome);
            System.out.println(categoria1.descricao);           
        }


    }

}