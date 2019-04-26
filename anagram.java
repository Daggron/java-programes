//This programme check whether the string is anagram or not
import java.util.*;
public class anagram {

public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    str1.toLowerCase();
    str2.toLowerCase();
    int count=1;
    if(str1.length()!=str2.length()){
        System.out.println("This is not anagram");
    }
    else {
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j) && str2.charAt(j) != '^') {
                    char a = str2.charAt(j);
                    str2 = str2.replace(a, '^');
                    count++;
                    break;

                }

            }
        }

        if ((count) == str1.length()) {
            System.out.println("The given string is anagram");
        } else {
            System.out.println("The given string is not anagram");
        }
    }
}


}
