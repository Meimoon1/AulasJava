import java.io.FileWriter;
import java.io.IOException;

public class View {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.marca = "Vw";
        c1.modelo = "Fusca";

        
        try {
            FileWriter fw = new FileWriter("Carros.csv",true);
            String carroString = String.format("%s;%s",c1.marca, c1.modelo);
            fw.write(carroString);
            fw.close();
        } catch (IOException e) {
            System.out.println("Não foi possível abrir o arquivo");
        }
    }
}
