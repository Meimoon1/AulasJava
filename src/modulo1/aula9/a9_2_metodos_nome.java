package modulo1.aula9;

public class a9_2_metodos_nome {
    public static void main(String[] args) {
        imprimir_nome("Melissa", "Matos");
    }
    //Método imprimir que recebe dois parâmetros string e tem retorno void
    static void imprimir_nome(String nome, String sobrenome){
        System.out.printf("%s %s ",nome, sobrenome);

    }
}
