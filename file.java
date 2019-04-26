// You are using Java
import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int test=input.nextInt();
        for(int i=0;i<test;i++){
            int words,testcases;
            words=input.nextInt();
            testcases=input.nextInt();
            String a[] = new String[words];
            for (int j=0;j<words;j++)
            {
                a[j]=input.next();
            }

            int l=0;
            int count=0;
            String phrase[]=new String[10];
            for(int k=0;k<testcases;k++){
                l=input.nextInt();
                for(int start=0;start<l;start++){
                    phrase[start]=input.next();
                }
            }
            for(int start=0;start<words;start++){
                for(int second=0;second<l;second++){
                    if(a[start].equals(phrase[second])){
                        count=1;
                        break;
                    }
                }
                if(count==1){
                    System.out.print("YES"+" ");
                }
                else{
                    System.out.print("NO ");
                }
                count=0;
            }
        }
    }
}