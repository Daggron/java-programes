// Programme to calculate the sum of the divisor of a given number
//Author: Abhay Sharma


import java.util.*;

interface calculater{
    void calculate(int n);
}

class student implements calculater{
    public void calculate(int n){
        int sum=1;
        for(int i=2;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        System.out.println("Sum: "+sum);
    }
}



public class sumofdivisior {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        student s= new student();
        int n=input.nextInt();
        s.calculate(n);
    }

}
