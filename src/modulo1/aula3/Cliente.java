package modulo1.aula3;

import java.util.Scanner;

public class Cliente {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------------Cadastro de Clientes------------------\n");
        System.out.println("\t Bem vindo!! Digite o nome do cliente:");
        System.out.printf("\t Digite o nome do cliente:");
        String nome = sc.next();
        System.out.printf("\t Digite a idade do cliente:");
        short idade = sc.nextShort();
        System.out.printf("\t O cliente %s de idade %d foi cadastro com sucesso!",nome,idade);

    }
}
