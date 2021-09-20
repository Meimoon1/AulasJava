//Atividade que retorna números pares até 100 e números primos até 150---- data: 20/09/2021
//Academia Java Capgemini

package modulo1.Pratica.Exercicio;
import java.util.Scanner;
public class Pratica6_NumerosParesEPrimos_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n 1-Números pares \n 2-Números Primos");
        int opcao = sc.nextInt();


        switch (opcao) {
            case 1:
                System.out.println("--------------Números pares-----------");
                int par = 0;
                for (int i = 0; i <= 100; i++) {
                    par = i % 2;
                    if (par == 0) {
                        System.out.println(i);
                    }
                }
                break;
            case 2:
                System.out.println("---------------Números Primos----------------");

                for (int i = 0; i < 150; i++) {
                    boolean primo = true;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            primo = false;
                        }

                    }
                    if (primo) {
                        System.out.println(i);
                    }
                }

            break;
        }
    }
}
