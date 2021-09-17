package modulo1.aula6;

import java.util.Scanner;

public class a6_2_semanal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = sc.next();
        boolean validacao = true;
        while (validacao) {
            if (nome.length() < 3) {
                System.out.println("Digitou errado, \n DIGITE NOVAMENTE:");
                nome = sc.next();
            }else{
                validacao = false;
            }
        }
        System.out.println("Nome:"+nome);
    }
}