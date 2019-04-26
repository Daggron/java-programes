//Making own custom exception

class myexception extends Exception{
     myexception(String n){
        super(n);
    }
}

public class apniexception {

    public static void main(String[] args) {
        try {
            throw new myexception("Hello");
        } catch (myexception e) {
            System.out.println("HI I AM Fisrt");
            System.out.println(e.getMessage());

        }
    }
}
