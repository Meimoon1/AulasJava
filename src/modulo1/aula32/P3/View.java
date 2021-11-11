import java.io.FileWriter;

public class View{
    public static void main(String[] args) {
        IController c = new Controller();
        String retorno = c.salvar("dado");
        System.out.println(retorno);

        for (String d : c.ler()) {
            System.out.println(d);
        }
    }
}