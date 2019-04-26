 class Animals{
   void eat(){
        System.out.println("Eating");

    }
   void sleep(){
        System.out.println("Sleeping");
    }
}






class Bird extends Animals {
    void fly(){
        System.out.println("Bird:Flying");
    }

}

public class java1 extends Bird{
    public static void main(String[] args){
        Animals a = new Animals();
        a.eat();
        a.sleep();

        Bird b = new Bird();
        b.eat();
        b.fly();
        b.sleep();
    }
}
