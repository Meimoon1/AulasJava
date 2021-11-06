package controller;
import java.util.ArrayList;

import dao.BaseDao;

public abstract class BaseController<T> {
   private ArrayList<T> list;
   private BaseDao<T> dao;

   public BaseController(BaseDao dao){
       this.list = new ArrayList<T>();
       this.dao = dao;
   }

   public void create(T model){
       this.list.add(model);
       this.dao.save(model);
   }
   public ArrayList<T> read(){
        return this.list;
       
    }
    public void update(T model){
        if(this.list.contains(model)){
            this.delete(model);
            this.create(model);
        }
    }
    public void delete(T model){
        this.list.remove(model);
    }
}
