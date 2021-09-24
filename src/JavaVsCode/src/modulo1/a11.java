package modulo1;
import java.util.Scanner;

public class a11 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //System.out.print("Informe idade:");
    //byte idade = Byte.parseByte(sc.nextLine());
    //while(idade<0){
   //     System.out.println("Idade não pode ser negativa! \n Digite novamente");
   //     idade = Byte.parseByte(sc.nextLine());
   // }

    byte idade = 0;
     do{
        System.out.print("Digite sua idade:");
        idade = Byte.parseByte(sc.nextLine());
        if(idade<0){
            System.out.println("Idade não pode ser negativa");
        }

     }while (idade < 0 );


    System.out.println("-----------Fim------------");

    
}
    
}
