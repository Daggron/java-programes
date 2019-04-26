import java.util.*;
public class checking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int num=0,character=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='1'&&s.charAt(i)<='9'){
                num++;
            }
            else if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                character++;

            }
        }
        System.out.println("Numbers "+num);
        System.out.println("Characters "+character);

    }
}
