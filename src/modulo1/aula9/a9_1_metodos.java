// Aula dia 21/09
//Modulo 2-Procedimentos, funções e métodos
package modulo1.aula9;

import java.util.Scanner;

public class a9_1_metodos {
    public static void main(String[] args) {
        cabecalho();
        Scanner sc = new Scanner (System.in);
//        int r = soma(10,30);
//        System.out.println(r);
        System.out.println("Digite o primeiro número:");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = sc.nextInt();
    }
    static void cabecalho(){
        System.out.println("*-----------Calculadora--------------* \n");
    }
    static int soma(int num1, int num2){
        int soma = num1 + num2;
        return soma;
    }
}
