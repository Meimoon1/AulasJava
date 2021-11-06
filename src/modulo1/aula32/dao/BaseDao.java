package dao;
import java.io.IOException;
import java.io.FileWriter;

public abstract class BaseDao<T> implements IDao<T>{
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
}
