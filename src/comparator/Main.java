package comparator;

import comparator.SortByName;
import comparator.Student;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(3, "Ravi"));
        list.add(new Student(1, "Amit"));
        list.add(new Student(2, "Neha"));

        Collections.sort(list, new SortByName());

        System.out.println(list);
    }
}


