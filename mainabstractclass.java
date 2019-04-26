import java.util.Scanner;
abstract class base{
    int height,breadth;
    base(int height,int width){
        this.height=height;
        this.breadth=width;

    }
    void get_data(){


    }
    int show_data(){
        return (height*breadth);
    }
}

class derived extends base{
    int result;
    derived(int height,int breadth){

        // calling the main constructor of the base class using the super keyword
        super(height,breadth);
    }

    void show_result(){
        System.out.println("The Area of the Object is "+show_data());
    }

}




public class mainabstractclass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int height=input.nextInt();
        int width=input.nextInt();
        derived d = new derived(height,width);
        d.show_result();

    }
}
