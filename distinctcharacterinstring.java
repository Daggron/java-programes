import java.util.*;
import java.lang.String;

public class distinctcharacterinstring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String test = new String();
        test =sc.nextLine();
        char ori[] = new char[test.length()];
        int count=1;
        ori = test.toCharArray();

        int len = test.length();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(ori[i]==ori[j]&&ori[i]!='*'){
                   ori[j]='*';
                   count++;
                }
            }
            if(ori[i]!='*'){
                System.out.println(ori[i]+" Occurs "+count+" times");
            }
            count=1;

        }
    }
}
