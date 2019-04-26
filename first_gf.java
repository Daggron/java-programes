import java.util.Scanner;
public class first_gf{
    public static void main(String args[]){
        Scanner abhay=new Scanner(System.in);
        String name;
        System.out.println("Please Enter your girlfriend's Name");
        name=abhay.nextLine();
        Girlfriend gf=new Girlfriend();
        gf.getName(name);
        gf.showName();


    }
}
class Girlfriend{
    private String gf_name;
    public void getName(String name){
        gf_name=name;
    }
    public String retname(){
        return gf_name;
    }
    public void showName()
    {
        System.out.printf("The Name of your girlfriend was: %s",retname());
    }

}