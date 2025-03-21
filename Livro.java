package gcs;
public class Livro extends Item{
    private int dataP;
    private String nomeE;
    public Livro(int id, int data, int dataP, String nome, String nomeE, String autores){
        super(id,nome,data,autores);
        this.dataP = dataP;
        this.nomeE = nomeE;
    }
    public void setDatap(int tempD){
        this.dataP = tempD;
    }
    public void setNomeE(String tempN){
        this.nomeE = tempN;
    }
    public int getDataP(){
        return dataP;
    }
    public String getNomeE(){
        return nomeE;
    }
}
