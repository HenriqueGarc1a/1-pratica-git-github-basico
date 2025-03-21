package gcs;

import java.util.ArrayList;

public class CD extends Item {
    private String generoM;
    private ArrayList<String> faixas = new ArrayList<String>();
    public CD(int id, String nome,int data, String autores, String generoM, ArrayList<String> faixas){
    super(id,nome,data,autores);
    this.generoM = generoM;
    this.faixas = faixas;
    }
    public void setGeneroM(String tempG){
        this.generoM = tempG;
    }
    public void addFaixas(String temp){
        faixas.add(temp);
    }
    public String getGeneroM(){
        return generoM;
    }
    public ArrayList<String> getFaixas(){
        return faixas;
    }
}
