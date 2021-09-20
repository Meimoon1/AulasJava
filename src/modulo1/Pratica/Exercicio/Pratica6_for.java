package modulo1.Pratica.Exercicio;

import java.util.Scanner;

public class Pratica6_for{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = sc.next();
        System.out.println("Informe seu sobrenome:");
        String sobrenome = sc.next();

        for(int i=0 ; i < 10; i++){
            System.out.printf("%s %s \n",nome,sobrenome);
        }
    }


}
