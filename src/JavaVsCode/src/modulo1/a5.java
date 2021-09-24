package modulo1;
import java.util.Scanner;


public class a5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String linha = sc.nextLine(); //Lê uma linha inteira
        System.out.println("Foi lido : " + linha);

        String linha2 = sc.next();
        System.out.println("Foi lido 2: "+ linha2);
        

        String linha3 = sc.next();
        System.out.println("Foi lido 3: "+linha3);

        int n1 = sc.nextInt();
        System.out.println("Foi lido 4: "+n1);

        int n2 = sc.nextInt();
        System.out.println("Foi lido 5: "+n2);

        //double sal1 = Double.parseDouble(sc.nextLine());
        //float sal2 = Float.parseFloat(sc.nextLine());


        sc.close();
    }

    
  

   
    
}
