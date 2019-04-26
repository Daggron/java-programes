import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;
class person{
    String Dob;
}

class teacher extends person{
    int salary;
    String subs;

    void get_data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The salary of the Teacher");
        salary=sc.nextInt();
        System.out.println("Enter the Date of Birth");
        Dob=sc.next();
        System.out.println("Enter the subject");
        subs=sc.next();

    }
    void show_data(){
        System.out.println("Salary: "+salary);
        System.out.println("Date of Birth: "+Dob);
        System.out.println("Subjects: "+subs);
    }
}
class Student extends  person{
    int Studentid;
}

class College_Student extends Student{
    String college_name;
    int yearofstudy;

    void get_data(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The studentid of the student");
        Studentid=sc.nextInt();
        System.out.println("Enter the Date of Birth");
        Dob=sc.next();
        System.out.println("Enter the name of the college");
        college_name=sc.next();
        System.out.println("Enter the year of study");
        yearofstudy=sc.nextInt();
    }

    void show_data(){
        System.out.println("StudentId: "+Studentid+"\nDate of Birth: "+Dob+"\nCollege Name: "+college_name+"\nYear of study: "+yearofstudy);
    }
}
public class java2 {
    public static void main(String[] args){
        teacher t = new teacher();
        t.get_data();
        t.show_data();
        College_Student s = new College_Student();
        s.get_data();
        s.show_data();
    }
}
