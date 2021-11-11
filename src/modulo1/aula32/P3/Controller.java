import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller implements IController{
    
    public String salvar(String dado){
        try {
            FileWriter fw = new FileWriter("Dados.txt",true);
            fw.write(dado);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Dado: "+ dado + " Salvo com sucesso!";
    }

    public ArrayList<String> ler() {
        ArrayList<String> dados = new ArrayList<String>();
       try {
           Scanner sc = new Scanner(new File("Dados.txt"));
           while(sc.hasNextLine()){
               String linha =sc.nextLine();
               dados.add(linha);
           }

       } 
       catch (Exception e) {
           e.printStackTrace();
       }
        return dados;
    }

}
  