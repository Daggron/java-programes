import java.util.Scanner;
public class array_pos {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<0&&a[j]>0)
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    //because no need to compare element further
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
