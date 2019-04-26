import java.util.Scanner;
public class jagged_array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();

        int array[][]= new int[rows][];

        int cols[]=new int[rows];

        int count=0;

        int sum=0;


        for(int i=0;i<rows;i++){
            int k=input.nextInt();
            cols[i]=k;
            array[i]=new int[k];
            for(int j=0;j<cols[i];j++){
                array[i][j]=input.nextInt();
                count++;
                sum+=array[i][j];
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols[i];j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("The Sum of elements is "+sum);
        System.out.println("The Mean of array"+(sum/count));
    }
}
