

import java.util.*;
public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The name of the employee");
        String name = sc.nextLine();
        Employee e = new Employee(name);
        e.get_data();
        e.show_data();
    }

}
