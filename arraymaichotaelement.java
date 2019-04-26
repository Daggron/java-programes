import java.util.*;

public class arraymaichotaelement {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size= input.nextInt();

        int array[] = new int[size];

        for(int i=0;i<size;i++){
            array[i]=input.nextInt();
        }

        for(int i=0;i<size;i++){
            int min=array[i];
            for(int j=i+1;j<size;j++){
                if(array[j]<min){
                    System.out.println(array[j]);
                    break;
                }
            }
        }
    }
}
