package Atividades_logica;

import java.util.Scanner;

public class atv2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        cabecalho();
        float a, p, r;
        //a armazena a altura e p armazena o peso
        a = informa_dados("Informe a altura: ");
        p = informa_dados("Informe o peso:");

        //o calculo do imc primeiro chama o peso, para seguir a ordem da função la embaixo.
        r = calculo_imc(p,a);
        System.out.println("O IMC é: " + r);
        //condição para classificar o imc

        if(r < 18.5){
            System.out.println("Abaixo do Peso;");
        }else if(r >= 18.6 && r <= 24.9 ){
            System.out.println("Peso Ideal");
        }else if(r >= 25 && r <= 29){
            System.out.println("Levemente acima do Peso");
        }else if(r >= 30 && r <= 34.9){
            System.out.print("Obesidade grau I");
        }else if(r >= 35 && r <= 39.9){
            System.out.println("Obesidade grau II Severa");
        }else if(r>40){
            System.out.println("Obesidade grau III Mórbida");
        }

    }
    static void cabecalho(){
        System.out.println("*---------------------CÁLCULO IMC---------------------*");
    }
    static float informa_dados(String mensagem){
        System.out.println(mensagem);
        float numero =  Float.parseFloat(sc.nextLine()); // recebe um float e passa para string.
        return numero;
    }
    static float calculo_imc(float n1,float n2){
        float imc = n1/(n2*n2); // onde n1 é o peso e n2 é a altura
        return imc;

    }
}
