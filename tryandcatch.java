//method to use throw
import java.util.*;
public class tryandcatch {
    static void validate(int age){
        if(age>100){
            throw new ArithmeticException("You must be Exceptional");
        }
        else if(age>18){
            System.out.println("You are An Adult");
        }
        else if(age>=13&&age<=18){
            System.out.println("You are a teenager");
        }
        else{
            System.out.println("You Are Kid");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        try {
            validate(n);
        }
        catch (ArithmeticException e){
            System.out.println("You Must Be Exceptional");
        }

    }
}
