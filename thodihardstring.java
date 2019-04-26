
//Program to display the first word of the string and the last word and reverse of mid elements of the string


import java.util.*;

class student1{
    String str;
    void display(String str){
        this.str=str;
        int word=str.split("\\s").length;
        int numofletter=str.split("").length;
        System.out.print("Length : "+word);
        char a[]=new char[str.length()];
        a=str.toCharArray();
        int i=0;
        while(a[i]!=' '){
            System.out.print(a[i]);
            i++;
        }
        int j;
        for( j=str.length()-1;a[j]!=' ';j--){
            System.out.print(a[j]);
        }
        /*
        if(word%2==0){

        }
        */
    }

}





public class thodihardstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        student1 s1 = new student1();
        s1.display(str);
    }
}
