import java.util.Scanner;
public class cutsticks {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int array[] = new int[size];
    for(
    int i = 0;
    i<size;i++)

    {
        array[i] = sc.nextInt();
    }

    for(int i = 0; i<size;i++) {
        int min=99999;
        int count=0;
        for(int j=0;j<size;j++){
            if(array[j]<min&&array[j]>0){
                min=array[j];
            }
            if(array[j]>0){
                count++;
            }
        }

        for(int k=0;k<size;k++){
            if(array[k]>0)
                 array[k]-=min;

        }
       if(count>0)
        System.out.println(count);

    }
}
}
