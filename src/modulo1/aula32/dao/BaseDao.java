package dao;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import model.Pessoa;
public class BaseDao<T> {
    protected String filename;

    public BaseDao(String filename){
        this.filename = filename;
    }

    //aqui estou recebendo um modelo e mandando salvar num arquivo de texto
    public void save(T model){
        try {
            FileWriter fw = new FileWriter(filename, true);
            fw.write(model.toString());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //lendo em arquivo de texto e transformar de volta em objeto
  
    public void update(){
        
    }
    public void remove(){
        
    }
}
