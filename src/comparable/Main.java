package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(3, "Ravi"));
        list.add(new Student(1, "Amit"));
        list.add(new Student(2, "Neha"));

        Collections.sort(list); // uses compareTo()

        System.out.println(list);
    }
}

