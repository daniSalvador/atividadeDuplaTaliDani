package Controller;

import java.util.ArrayList;

public class BaseController<T> {
    private ArrayList<T> dados;

    public BaseController() {
        this.dados = new ArrayList<T>();
    }

    public int tamanhoLista(){
        return this.dados.size();
    }

    // CRUD:
    // CREATE
    public void create(T obj){
        this.dados.add(obj);
    }
    // READ
    public ArrayList<T> read(){
        return this.dados;
    }
    // UPDATE
    public void update(T obj){
        if(verify(obj)){
            this.delete(obj);
            this.create(obj);
        }
    }
    // DELETE
    public void delete(T obj){
        this.dados.remove(obj);
    }

    public boolean verify(T obj) {
        return this.dados.contains(obj);
    }
}