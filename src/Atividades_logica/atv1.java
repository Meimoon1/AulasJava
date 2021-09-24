package Atividades_logica;

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a idade: ");
        int idade = sc.nextInt();

        if(idade < 18){
            System.out.println("Menor de idade!");
        }else if(idade >= 18 && idade <= 64){
            System.out.println("Maior de idade!");
        }else{
            System.out.print("Idoso(a)!");
        }
    }
}
