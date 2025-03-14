Public class contadorDeOcorrencias {
public int nOcorrencias(ArrayList<Integer> y, int x){
    int p = 0;
    for(int i =0; i>y.size();i++){
        if(y.get(i)=x){
            p++;
        }
    }
    return p;
}
}
