package dao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import model.BaseModel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public abstract class BaseDao<T extends BaseModel> implements IDao<T>{
    protected String filename;

    public BaseDao(String filename){
        this.filename = filename;
    }

    //aqui estou recebendo um modelo e mandando salvar num arquivo de texto
    public void save(T model){
        try {
            FileWriter fw = new FileWriter(filename, true);
            fw.write(model.toString());
            fw.write("\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //lendo em arquivo de texto e transformar de volta em objeto
    public void update(T model){

    }


    public void remove(T model){
        updateOrRemove(model);
    }

    private void updateOrRemove(T model) {
        try {
            ArrayList<String> listLinhas = new ArrayList<String>();
            Scanner sc = new Scanner(new File(this.filename));
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                int id = Integer.parseInt(linha.split(";")[0]);

              if(id != model.id){
                listLinhas.add(linha);
              }
               
            }
            FileWriter fw = new FileWriter(filename);
            for (String l : listLinhas) {
               fw.write(l+ "\n"); 
            }
            fw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
