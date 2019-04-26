import java.util.*;

class string{
    String s;
    int num;
    void count(String s ,int num){
        this.s=s;
        this.num=num;
        int word=0;
        int letter=0;
        while(true){
            word+=s.split("\\s").length;
            letter+=s.split("").length;
           break;
        }
        char c[]=new char[s.length()];
        c=s.toCharArray();
        int sum=0,sumsum=0,x=0,y=0,z=0;
        int i=0;
        while(i<c.length){

            sum+=c[i];
            sumsum+=c[i];
            if(c[i]==' '||c[i]=='\0'){
                if(sumsum<300) {
                    sumsum = 0;
                    x++;
                }
                 else if(sumsum>300){
                    sumsum=0;
                    y++;
                }
                 else if(sumsum==300){
                    sumsum=0;
                    z++;
                }
            }
            i++;
        }

        if(sumsum<300) {
            sumsum = 0;
            x++;
        }
        else if(sumsum>300){
            sumsum=0;
            y++;
        }
        else if(sumsum==300){
            sumsum=0;
            z++;
        }

        System.out.println("Number of Alphabets "+letter);
        System.out.println("Number of words"+word);
        System.out.println("Sum of ascii values "+(sum-'+'));
        System.out.println("Greater than 300 "+y);
        System.out.println("Smaller than 300 "+x);
        System.out.println("Equal to 300 "+z);

    }
}
public class Stringksathjadoo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        string obj = new string();
        obj.count(s,300);

    }
}
