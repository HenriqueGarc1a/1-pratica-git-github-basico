package gcs;
public class Item {
    private int id;
    private String nome;
    private int data;
    private String autores;
    public Item (int id, String nome,int data, String autores){
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.autores = autores;
    }
    public void setId(int nid){
        this.id = nid;

    }
    public void setNome(String nNome){
        this.nome = nNome;
    }
    public void setAutores(String nAutor){
        this.autores = nAutor;
    }
    public void setData(int nData){
        this.data = nData;
    }
    public int getId(){
        return id;
    }
    public int getData(){
        return data;
    }
    public String getAutores(){
        return autores;
    }
    public String getNome(){
        return nome;
    }
}
