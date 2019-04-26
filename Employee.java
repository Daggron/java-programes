import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;
public class Employee extends Person{
    double annualSalary;
    int year;
    String nsn;
    Employee(){

    }
    Employee(String name){
        super(name);
    }

    public void get_data(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Salary");
        annualSalary=input.nextInt();
        System.out.println("Enter the year of joining");
        year=input.nextInt();
        System.out.println("Enter you national security number");
        nsn=input.next();

    }

    public void show_data(){
        System.out.println("Name: "+getName()+"\nSalary: "+annualSalary+"\nYear of joining "+year+"\nNational Security Number: "+nsn);
    }
}
