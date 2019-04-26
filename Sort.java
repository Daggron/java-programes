import java.util.Scanner;
public class Sort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfElements=input.nextInt();
        int array[]=new int[numberOfElements];
        for(int i=0;i<numberOfElements;i++){
            array[i]=input.nextInt();
        }
        for(int i=0;i<numberOfElements;i++){

            for(int j=0;j<numberOfElements-1;j++)
            {
                if(array[j]<0&&array[j+1]>0){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int i=0;i<numberOfElements;i++){
            System.out.print(array[i]+" ");
        }
    }
}


