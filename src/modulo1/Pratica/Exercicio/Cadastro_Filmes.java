package modulo1.Pratica.Exercicio;

import java.util.Scanner;

public class Cadastro_Filmes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------- Cadastro de Filmes/Séries/Documentários-------------------");
        System.out.println("Escolha a opção que deseja cadastrar:");
        System.out.println(" 1-Cadastrar Filme \n 2-Cadastrar Série \n 3-Cadastrar Documentário \n 4-Sair");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Informe o nome do filme:");
                String nomeF = sc.next();
                System.out.println("Informea descrição do filme:");
                String descF = sc.next();
                System.out.println("Informe o ano de lançamento do filme:");
                String anoF = sc.next();
                System.out.println("Informe a produtora do filme:");
                String prodF = sc.next();
                System.out.println("Filme Cadastrado com sucesso!");
            break;
            case 2:
                System.out.println("Informe o nome da Série:");
                String nomeS = sc.next();
                System.out.println("Informe o ano de lançamento da Série:");
                String anoS = sc.next();
                System.out.println("Informe a produtora da Série:");
                String prodS = sc.next();
                System.out.println("A série foi cadastrada com sucesso!");
            break;
            case 3:
                System.out.println("Informe o nome do Documentário:");
                String nomeD = sc.next();
                System.out.println("Informe o ano de lançamento do Documentário:");
                String anoD = sc.next();
                System.out.println("Informe o tema do Documentário:");
                String tema = sc.next();
                System.out.println("O Documentário foi cadastrado com sucesso!");
            break;
            case 4:
                System.out.println("Saindo...");
            break;
        }
    }
}
