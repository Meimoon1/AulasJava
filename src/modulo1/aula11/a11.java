package aula11;

public class a11 {
    public static void main(String[] args) {
        //criando uma instancia da classe produto(objeto)
        Produto produto1 = new Produto();
        produto1.nome = "TV";
        produto1.descricao = "Tv da xuxa";
        produto1.valor = 1234.98;

        Produto produto2 = new Produto();
        produto2.nome = "Geladeira";
        produto2.descricao = "Branca com duas portas";
        produto2.valor = 1500.50;

        System.out.println(produto1.nome);
        System.out.println(produto2.nome);

    }
}
