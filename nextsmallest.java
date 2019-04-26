import java.util.*;
public class nextsmallest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size;
        size=input.nextInt();

        int array[] = new int[size];

        for(int i=0;i<size;i++){
            array[i]=input.nextInt();
        }

        for(int i=0;i<size;i++){
            int sum=0;
            for(int j=0;j<size;j++){

                if(i==j){
                    continue;
                }
                sum+=array[j];

            }
            System.out.println("The Sum of the elements below "+ array[i]+" is "+sum);
        }

    }
}
