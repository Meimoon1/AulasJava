import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.marca = "Vw";
        c1.modelo = "Fusca";

        //transformando objeto p texto
        try {
            FileWriter fw = new FileWriter("Carros.csv",true);
            //DAO - data access object, ele pega um dado e converte p objeto e vice versa
            String carroString = String.format("%s;%s\n",c1.marca, c1.modelo);
            fw.write(carroString);
            fw.close();
        } 
        catch (IOException e) {
            System.out.println("Não foi possível abrir o arquivo");
        }

        //transformando texto p obj
        try {
            Scanner sc = new Scanner(new File("Carros.csv"));
            while(sc.hasNextLine()){
                //fazendo um dao
                String linha = sc.nextLine();
                String[] carroString = linha.split(";");

                Carro c = new Carro();
                c.marca = carroString[0];
                c.modelo = carroString[1]; 
                System.out.printf("%s-%s \n",c.marca,c.modelo);
                
            }
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível abrir o arquivo");        }


    }
}
