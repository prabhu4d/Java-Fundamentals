package Basic.src.oops;

class Dad{
    public void job(){
        System.out.println("Dad Job is Doctor");
    }
}

class Son extends Dad{
    @Override
    public void job(){
        // to call super method
        super.job();
        System.out.println("Son is Software Engineer");
    }
}

public class MethodOverriding {
    public static void main(String[] args){
        Son prabhu = new Son();
        prabhu.job();
    }
}
