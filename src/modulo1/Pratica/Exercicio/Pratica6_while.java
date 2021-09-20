package modulo1.Pratica.Exercicio;

import java.util.Scanner;

public class Pratica6_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = sc.next();
        System.out.println("Informe seu sobrenome:");
        String sobrenome = sc.next();

        int contador = 0;
        while(contador < 10){
            System.out.printf("%s %s \n",nome,sobrenome);
            contador++;
        }

    }
}
