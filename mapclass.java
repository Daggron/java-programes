
import java.util.HashMap;
import java.util.TreeMap;

class Books implements Comparable<Books>{

    int bid;
    int  bq;
    String title;

    Books(int bid,int bq,String title){
        this.bid=bid;
        this.bq=bq;
        this.title=title;
    }


   public int compareTo(Books ob){
        if(bid>ob.bid){
            return 1;
        }
        else if(bid<ob.bid){
            return -1;
        }
        else {
            return 0;
        }
    }
}



public class mapclass {

    public static void main(String[] args){


        TreeMap<Integer,Books> hm = new TreeMap<>();
        hm.put(1,new Books(171091025,145,"Hamlet"));
        hm.put(2,new Books(1,145,"To be or not to be"));


        for (HashMap.Entry<Integer,Books> m : hm.entrySet()){
            Books b = m.getValue();
            System.out.println(b.bid+" "+b.bq+" "+b.title);

        }
    }
}
