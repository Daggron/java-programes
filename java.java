import java.util.Scanner;
public class java {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num,secnum;
        System.out.println("\nEnter the number");
        num=sc.nextInt();
        secnum=sc.nextInt();
        if(num>secnum){
            System.out.println(num +" is greater than "+secnum);
        }
        else if(num==secnum){
            System.out.println(num+"is equal to"+secnum);
        }
        else{
            System.out.print(secnum+" is greater than "+num);
        }
    }
}
