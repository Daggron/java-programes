import java.util.Scanner;
class bijlidev{
    int units;
    int money=0;
    Scanner sc = new Scanner(System.in);
    void get_data(){
        units=sc.nextInt();

    }
    void calculate(){
        if(units>300){
            int temp=units-300;
            money+=temp*90;
            units=units-temp;
        }
        if(units>200){
            int temp=units-200;
            money+=temp*80;
            units=units-temp;
        }
        if(units>100){
            int temp=units-100;
            money+=temp*80;
            units=units-temp;
        }
        if(units<=100){
            money+=units*60;
        }

    }
    void display(){
        if(money>30000){
            money+=200;
            System.out.println(money);
        }
        else{
            System.out.println(money);
        }

    }
}

public class bijlibill {
    public static  void main(String[] args){
        bijlidev bijli = new bijlidev();
        bijli.get_data();
        bijli.calculate();
        bijli.display();
    }
}
