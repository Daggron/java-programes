/*Making a number guessing game */
import java.util.Scanner;
public class udacity {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number =(int) ((Math.random()*100)+1);
        boolean haswon=false;
        for(int i=0;i<10;i++){
            System.out.println("You have "+(10-i)+" chances left");
            int choice = input.nextInt();
            if(choice>number){
                System.out.println("Your input is very high");
            }
            else if(choice<number){
                System.out.println("Your input is very low");
            }
            else{
                haswon=true;
                break;
            }
        }
        if(haswon){
            System.out.println("You won");
        }
        else{
            System.out.println("You loose");
        }
    }
}
