package MultiThreading;

public class LambdaExpression {
    public static void main(String[] args){
        Thread t1 = new Thread(() -> {
            for(int i=1; i<6; i++){
                System.out.println("Hi "+ i);
                try{ Thread.sleep(1000);} catch (Exception e){};
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=1; i<6; i++){
                System.out.println("Hello "+ i);
                try{ Thread.sleep(1000);} catch (Exception e){};
            }
        });

        t1.start();
        try { Thread.sleep(100);}catch (Exception e){};
        t2.start();
    }
}
