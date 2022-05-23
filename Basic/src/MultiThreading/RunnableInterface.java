package MultiThreading;

class Chikku implements Runnable{
    public void run(){
        for(int i=1; i<6; i++){
            System.out.println("Chikku " + i);
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.err.println("Error -> " + e);
            }
        }
    }
}

class Bukku implements Runnable{
    public void run(){
        for(int i=1; i<6; i++){
            System.out.println("Bukku " + i);
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.err.println("Error -> " + e);
            }
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args){
        System.out.println("Threads using Runnable Interface");

        Chikku chikku = new Chikku();
        Bukku bukku = new Bukku();

        Thread t1 = new Thread(chikku);
        Thread t2 = new Thread(bukku);

        t1.start();
        try{
            Thread.sleep(100);
        }catch (Exception e){};
        t2.start();
    }
}
