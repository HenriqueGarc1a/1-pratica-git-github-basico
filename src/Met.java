package src;

import java.util.ArrayList;

public class Met{
    

    public static boolean hasRepeat(ArrayList< Integer > l){

          for(int i = 0;i<l.size();i++){
            for(int j= 0;j<l.size();j++){

                    if(i!= j && l.get(i) == l.get(j))
                                    return true;
            }
          }
          
          return false;
          
    }
}
