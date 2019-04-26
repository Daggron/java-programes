import java.util.*;
public class eam {
        static void merge(int []A,int []B)
        { int len1=A.length;
            int len2=B.length;
            int arr[]=new int[len1+len2];
            int i;
            for(i=0;i<len1;i++){
                arr[i]=A[i];
            }
            for(int j=0;j<len2;j++){
                arr[i]=B[j];
                i++;
            }
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]+" ");
            }



        }
    public static void main(String args [])
    {

        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int [] A=new int[n1];

        for(int i=0;i<n1;i++)
        {
            A[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int [] B=new int[n2];
        for(int i=0;i<n2;i++)
        {
            B[i]=sc.nextInt();
        }
        merge(A,B);
    }
}