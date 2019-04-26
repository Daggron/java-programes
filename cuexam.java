import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class students{
    int id;
    String name;
    double cgpa;

    public students(int id,String name,double cgpa){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;

    }



}

public class cuexam {


    static public void sortfunc(ArrayList<students> l){
        for(int i=0;i<l.size();i++){

            for(int j=0;j<l.size()-i-1;j++) {
                students s = l.get(j);
                students n = l.get(j+1);

                if(s.cgpa<n.cgpa){
                    Collections.swap(l,j,j+1);
                }
                else if(s.cgpa==n.cgpa){
                    if(s.name.compareTo(n.name)>=1){

                        Collections.swap(l,j,j+1);
                    }
                }
            }

        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        ArrayList<students> s = new ArrayList<>();

        for(int i=0;i<size;i++){
            int id=sc.nextInt();
            String name=sc.next();
            double cgpa = sc.nextDouble();

            s.add(new students(id,name,cgpa));


        }

        sortfunc(s);

        for(students x :s){
            System.out.println(x.name);
        }


    }

}
