package modulo1.Pratica.Exercicio;

import java.util.Scanner;

public class Pratica_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*------------------CADASTRO-----------------*");
        System.out.println("*---Cadastro de equipe de quatro usuários---*");

        for (int i = 1 ; i<=4; i++){
            System.out.println("Informe o nome do usuário " + i +":");
            String nome = sc.nextLine();
            System.out.println("Informe o sobrenome do usuário " + i +":");
            String sobrenome = sc.nextLine();
        }
        System.out.println("Cadastro realizado!");
    }
}
