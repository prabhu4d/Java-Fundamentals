package Basic.src.DataTypes;

class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public void display(){
        System.out.println("Student " + rollNo + " " + name);
    }
}

public class Arrays {
    /*
    * 1D Array
    * 2D Array - Same Sizes
    * Jagged Array - Different Sizes
    *
    * */

    public static void main(String[] args){
//        int nums[] = new int[4];
        int nums[] = {11, 22, 33, 44};

        for(int num: nums){
            System.out.println(num);
        }

        Student students[] = {new Student(10, "Prabhu"),
                              new Student(11, "Ammu")};

        for(Student s: students){
            s.display();
        }

        // 2D Array
        int arrays[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for(int[] row: arrays){
            for(int cell: row){
                System.out.print(" "+cell);
            }
            System.out.println();
        }

    }
}
