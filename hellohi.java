public class hellohi {
    static void fun(){
        try {
            throw new NullPointerException("Demo");
        }
        catch (NullPointerException e){
            System.out.println("Hello");
            throw e;

        }

    }
    public static void main(String[] args){
        try{
            fun();
        }
        catch (NullPointerException e){
            System.out.println("Hi");
        }
    }
}
