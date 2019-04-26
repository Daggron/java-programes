import java.util.Scanner;
public class average_calculator{
    public static void main(String[] args){
        calculator cal=new calculator();

        double x=cal.getAverage();
        System.out.println("Your Average is:"+x);
    }
}

class calculator{
    double Average=0;
    int n;
    calculator(){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
            Average+=array[i];
        }
    }
    double getAverage(){
        return (Average/n);
    }


}