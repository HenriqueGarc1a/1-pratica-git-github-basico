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

    public static ArrayList<Integer> listRepeat(ArrayList< Integer > l){

        ArrayList<Integer> x = new ArrayList<>();

        for(int i = 0;i<l.size();i++){
            for(int j= 0;j<l.size();j++){

                    if(i!= j && l.get(i) == l.get(j) && !x.contains(l.get(j)))
                        x.add(l.get(j));
            }
          }
          
          return x;

    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2){

         ArrayList<Integer> x = new ArrayList<>();


         for(int i = 0;i<l1.size();i++){
            for(int j= 0;j<l2.size();j++){

              

                if(l1.get(i)-l2.get(j) == 0 && !x.contains(l2.get(j)))
                        x.add(l2.get(j));

                

            }
          }

          return x;


    }
        
}
