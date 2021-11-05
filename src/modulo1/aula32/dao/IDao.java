package dao;
import java.util.ArrayList;

//diz todos os métodos que uma classe deve ter
//interface não implementa
public interface IDao<T> {
    public void save(T model);
    public ArrayList<Object> list();
    public void update(T model);
    public void remove(T model);
}
