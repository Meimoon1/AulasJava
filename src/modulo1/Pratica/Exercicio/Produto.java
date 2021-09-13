package modulo1.Pratica.Exercicio;

import java.util.Scanner;

public class Produto {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------Cadastro de Produtos e Categorias---------------");
        System.out.printf("Bem vindoo!! Informe o nome do produto:\n");
        String nome = sc.next();
        System.out.printf("Informe a descrição do produto: \n");
        String desc = sc.next();
        System.out.printf("Informe o valor do produto: \n" );
        double valor = sc.nextDouble();
        System.out.printf("Informe a categoria do produto:  \n");
        String cat = sc.next();
        System.out.printf("O produto %s com descrição %s valor %f e categoria %s foi cadastrado com sucesso!",nome,desc,valor,cat);

    }
}
