package MultiThreading;

public class LambdaExpression {
    public static void main(String[] args) throws Exception{
        Thread t1 = new Thread(() -> {
            for(int i=1; i<6; i++){
                System.out.println("Hi "+ i);
                try{ Thread.sleep(1000);} catch (Exception e){};
            }
        }, "Hi Thread");

        Thread t2 = new Thread(() -> {
            for(int i=1; i<6; i++){
                System.out.println("Hello "+ i);
                try{ Thread.sleep(1000);} catch (Exception e){};
            }
        }, "Hello Thread");

//        t1.setName("Hi Thread");
//        t2.setName("Hello Thread");
//        System.out.println(t1.getName());
//        System.out.println(t2.getName());

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        try { Thread.sleep(100);} catch (Exception e){};
        t2.start();

        // how to check the thread is running ?
        System.out.println("t1 is Alive ? " +  t1.isAlive());

        /*
        * telling main thread to wait for t1, t2
        *
        *  t1, t2 threads joins to main thread
        * */
        t1.join();
        t2.join();

        // After join to main thread, the exit
        System.out.println("t1 is Alive ? " +  t1.isAlive());

        System.out.println("Bye");
    }
}
