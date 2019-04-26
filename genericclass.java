import java.util.TreeSet;


class Book implements Comparable<Book>{
    int bid;
    int bq;
    String name;

    public Book(int bid,int bq,String name){
        this.bid=bid;
        this.bq=bq;
        this.name=name;
    }

    public int compareTo(Book ob){

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


public class genericclass{
    public static void main(String[] args){
        TreeSet<Book> tr = new TreeSet<>();
        tr.add(new Book(2,5,"Abhay"));
        tr.add(new Book(5,7,"Sharma"));
        tr.add(new Book(1,6,"Sharma"));



        for(Book b:tr){
            System.out.println(b.bid+" "+b.bq+" "+b.name);
        }

    }
}