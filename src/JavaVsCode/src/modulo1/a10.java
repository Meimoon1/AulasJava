package modulo1;
import java.util.Scanner;

public class a10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe idade:");
        byte idade = Byte.parseByte(sc.nextLine());
        while(idade<0){
            System.out.println("Idade não pode ser negativa! \n Digite novamente");
            idade = Byte.parseByte(sc.nextLine());
        }
        System.out.println("-----------Fim------------");
    }
    
}
