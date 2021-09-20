//Exercício para calcular retorno de investimento usando for.

package modulo1.Pratica.Exercicio;

import java.util.Scanner;

public class Pratica6_investimento_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rendimento por mês do investimento de R$5.000,00 no período de 24 mêses");
        double investimento = 5000;
        double taxa = 0.2;
        double totalMes = 0;

        for (int meses = 1; meses <= 24; meses++){
            totalMes = investimento * Math.pow(1.0 + taxa, meses);
            System.out.println("Mês " + meses + " Rendimento: " + totalMes);

        }

    }
}
