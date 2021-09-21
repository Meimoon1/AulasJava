package modulo1.Pratica.Exercicio;

import java.util.Scanner;

public class Pratica8_metodos {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        cabecalho();
        double v1 = 0, v2 =0, r=0,r1 =0,r2 =0, r3=0;
        v1 = ler_numero("Informe o primeiro número:");
        v2 = ler_numero("Informe o segundo número:");
        r = soma(v1,v2);
        System.out.println("A soma é: "+r);
        r1 = subtracao(v1,v2);
        System.out.println("A Subtração é: "+r1);
        r2 = multiplicacao(v1,v2);
        System.out.println("A multiplicação é: "+r2);
        r3 = divisao(v1,v2);
        System.out.println("A Divisão é: "+r3);
    }

    static void cabecalho(){
        System.out.println("*----------Prática Métodos-------------");
    }
    static int ler_numero(String mensagem){
        System.out.print(mensagem);
        int numero = Integer.parseInt(sc.nextLine());
        return numero;
    }
    static double soma(double valor1, double valor2){
        double resultado = valor1 + valor2;
        return resultado;

    }
    static double subtracao(double valor1, double valor2){
        double resultado = valor1 - valor2;
        return resultado;

    }
    static double multiplicacao(double valor1, double valor2){
        double resultado = valor1 * valor2;
        return resultado;

    }
    static double divisao(double valor1, double valor2){
        double resultado = valor1 * valor2;
        return resultado;
    }



}
