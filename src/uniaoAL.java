public class uniaoAL{
    public ArrayList<Integer> uniaoAL(ArrayList<Integer> x, ArrayList<Integer> y){
     ArrayList<Integer> resposta = new ArrayList<Integer>();
     for(int i =0;i<x.size();i++){
        resposta.add(x.get(i));
     }
     for(int p = 0;p<y.size();p++){
        resposta.add(y.get(p));
     }
     return resposta;
    }
}
