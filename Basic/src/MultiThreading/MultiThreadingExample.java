package MultiThreading;

class Hello extends Thread{
    public void run(){
        for(int i=1; i<6; i++){
            System.out.println("Hello " + i);
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.err.println("Error -> " + e);
            }
        }
    }
}

class Hi extends Thread{
    public void run(){
        for(int i=1; i<6; i++){
            System.out.println("Hi "+ i);
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.err.println("Error -> " + e);
            }

        }
    }
}

public class MultiThreadingExample {
    public static void main(String[] args){
        Hi hi = new Hi();
        Hello hello = new Hello();

        hi.start();
        try{
            Thread.sleep(100);
        }catch (Exception e){};
        hello.start();
    }
}
