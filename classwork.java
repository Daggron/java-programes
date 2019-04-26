import java.util.*;
class store{
    int roll;
    int marks;
    String name;
    store(int roll,int marks,String name){
        this.roll=roll;
        this.marks=marks;
        this.name=name;
    }
}


public class classwork {
    static void swap(ArrayList<store> el){
        for(int i=0;i<el.size()-1;i++){
            for(int j=0;j<el.size()-i-1;j++){
                store e = el.get(j);
                store f = el.get(j+1);
                if(e.roll>f.roll){
                    Collections.swap(el,j,j+1);
                }
            }
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<store> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int roll=sc.nextInt();

            String name=sc.next();
            int marks=sc.nextInt();
            list.add(new store(roll,marks,name));
        }

        swap(list);
        for(store hm :list){
            System.out.println(hm.roll+" "+hm.name+" "+hm.marks);

        }

    }
}

