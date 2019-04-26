import java.util.Scanner;
public class array_gayab{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            int min=9999;
            for(int j=0;j<n;j++)
            {
                if(array[j]<min&&array[j]>0)
                {
                    min=array[j];
                }
            }
            for(int k=0;k<n;k++)
            {
                if(array[i]>0) {
                    array[k] -= min;
                }
            }
            System.out.println(min);
            count++;
        }
        System.out.println(count);
        for(int i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
    }

}
