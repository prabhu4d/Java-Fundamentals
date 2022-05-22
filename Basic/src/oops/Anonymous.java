package Basic.src.oops;

interface Love{
    void propose();
}

class Book{
    public void show(){
        System.out.println("Book Show");
    }

    public void category(){
        System.out.println("24 Category");
    }
}


public class Anonymous {
    public static void main(String[] args){
        Book book = new Book(){
            // Anonymous Class
            public void show(){
                System.out.println("Anonymous Book Show");
            }
        };

        book.show();
        book.category();

        Love l = new Love() {
            @Override
            public void propose() {
                System.out.println("I love you");
            }
        };

        l.propose();
    }
}
