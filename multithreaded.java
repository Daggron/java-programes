//A java programme to implement multi threaded progarmming


public class multithreaded extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Kuch nahi");
        }
    }
    public static void main(String[] args){
        multithreaded ja = new multithreaded();
        multithreaded je = new multithreaded();
        ja.start();
        je.start();

    }
}
