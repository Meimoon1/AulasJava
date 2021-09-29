package modulo1;
import java.util.Scanner;

public class a22 {
    public static void main(String[] args) {
        int n3 = ler("Digite n1:");
        int n4 = ler("Digite n2");
        double r = dividir(n3, n4);
        System.out.println("a divisão é: "+r);
;    }

    static int ler(String mensagem){
        Scanner sc = new Scanner (System.in);
        System.out.println(mensagem);
        int numero = Integer.parseInt(sc.nextLine());
        sc.close();
        return numero;
    }  
    
    static double dividir(int n1, int n2){
        double divisao = n1/n2;
        return divisao;
    }
    
}
