// You are using Java
import java.util.*;
public class unique{
    public static void countFreq(int arr[],int n){
        int count=1;
        System.out.println("\nArray with unique values :");
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]&&arr[j]!=-99999){
                    arr[j]=-99999;
                }
            }
            if(arr[i]!=-99999){
                count++;
            }
        }
        int b[]=new int[count];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=-99999){
                b[k]=arr[i];
                k++;
            }
        }
        int temp=b[k-1];
        b[k-1]=b[k-2];
        b[k-2]=temp;
        for(int i=0;i<count-1;i++){
            System.out.print(b[i]+" ");
        }
        System.out.print("\n---------------------------");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter The Element in the Array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Original Array :");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        countFreq(array,n);
    }
}