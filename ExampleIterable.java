import java.util.LinkedList;

public class ExampleIterable{

    public static void main(String args[]){

        LinkedList<Integer> l =  new LinkedList<Integer>();
        
        int iterations = 100000;
        for(int i=0; i< iterations; i++){
            l.add(i);
        }

        //------------------
        //O(n^2)
        double start_1 = System.currentTimeMillis();
        for(int i=0; i< iterations; i++){ //<- O(n)
            int j=l.get(i); //<- O(n)
        }
        double end_1 = System.currentTimeMillis();
        
        //-----------------

        /*
        Iterator iter = l.iterator();
        while(iter.hasNext()){
            int i = iter.next();

            //BODY 
        }

        */

        double start_2 = System.currentTimeMillis();
        for(int i : l){ //<-- iterable interface
            int j = i;
        }
        double end_2 = System.currentTimeMillis();
        

        System.out.println("Time 1: " + (end_1-start_1));
        System.out.println("Time 2: " + (end_2-start_2));
    }
}