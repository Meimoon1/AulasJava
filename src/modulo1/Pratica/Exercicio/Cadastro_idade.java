package modulo1.Pratica.Exercicio;

import java.util.Scanner;

public class Cadastro_idade {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------CADASTRO DE CLIENTE-------------------");
        System.out.println("Infome o nome:");
        String nome = sc.next();
        System.out.println("Infome o sobrenome do cliente:");
        String sobrenome = sc.next();
        System.out.println("Informe a idade do cliente:");
        int idade = sc.nextInt();

        if(idade >= 18){
            System.out.println("o Cliente " + nome +" "+ sobrenome +" com idade "+ idade +" foi cadastrado com sucesso!");
        }else{
            System.out.println("Cliente não pode ser cadastrado, pois é menor de idade.");
        }


    }
}
