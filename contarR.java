public class contarR {
    public int nroRepeat(ArrayList< Integer > l){
        int count = 0;
        for(int i=0;i<l.size();i++){
         boolean jaContado = false;
         for (int y=0;y<l.size();y++){
            if(l.get(y) == l.get(i)&& i != y){
                jaContado = true;
                break;
            }
         }
         if(jaContado = false){
            int ocorrencias = 0;
            for(int t = 0;t<l.size();t++){
                if(l.get(t)==l.get(i)){
                    ocorrencias++;
                }
            }
            if(ocorrencias>1){
                count++;
            }
         }
        }
     return count;
    } 
}
