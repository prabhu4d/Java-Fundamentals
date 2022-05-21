package Basic.src.oops;

/*
* Object Know Something with the help of Variables
* Object Does Something with help of Methods
* */


// Encapsulation -> Binding data with methods
class Elephant{
    private int id;
    private String name;

    // Getters and Setters

    public int getId() {
        System.out.println("User Accessing ID");
        return id;
    }

    public void setId(int id) {
        System.out.println("User Changed the ID");
        this.id = id;
    }

    public String getName() {
        System.out.println("User Accessing ID");
        return name;
    }

    public void setName(String name) {
        System.out.println("User Changed the Name");
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args){
        Elephant kutty = new Elephant();
        kutty.setId(10);
        kutty.setName("Kutty Yana");
        System.out.println(kutty.getName());
    }
}
