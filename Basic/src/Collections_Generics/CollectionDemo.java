package Collections_Generics;

import java.util.*;
import java.util.stream.Collectors;


class Stud implements Comparable<Stud>{
    int rollno, marks;
    String name;

    public Stud(int rollno, String name, int marks){
        super();
        this.rollno = rollno;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
    }

    public int compareTo(Stud s){
        return marks > s.marks ? 1: -1;
    }
}

public class CollectionDemo {
    public static void main(String[] args){
        // for ArrayList there is no index access
        Collection values = new ArrayList();
        values.add(4);
        values.add(5);
        values.add(1);
        values.add(0);

        //        System.out.println(values);

        for (Object value : values) {
            System.out.println(value);
        }

        // support all Objects
        List list_values = new ArrayList();
        list_values.add(10);
        list_values.add(0, 1);

        System.out.println("List Values" + list_values);

        for(int i=0; i<list_values.size(); i++){
            System.out.println(list_values.get(i));
        }

        // Typed Collections -> Generics
        List<Integer> int_values = new ArrayList<>();
        int_values.add(10);
        int_values.add(-1);
        int_values.add(0);

        // Collection Class
        Collections.sort(int_values);

        for(Object o: int_values){
            System.out.println(o);
        }

        // Comparator Interface
        List<Integer> val = new ArrayList<>();
        val.add(408);
        val.add(301);
        val.add(205);

//        Comparator<Integer> c = (i, j) -> i%10 > j%10 ? 1 : -1;

        val.sort((i, j) -> i%10 > j%10 ? 1 : -1);
        System.out.println("val " + val);

        // Comparable Interface
        List<Stud> studs = new ArrayList<>();
        studs.add(new Stud(10, "Prabhu", 50));
        studs.add(new Stud(20, "John", 100));
        studs.add(new Stud(30, "Vignesh", 60));

        Collections.sort(studs);
        for(Stud s: studs){
            System.out.println(s);
        }
    }
}
