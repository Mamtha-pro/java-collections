package collectioninterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnHashSet {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Mahi",1));
        studentSet.add(new Student("Ravi",2));
        studentSet.add(new Student("Kavitha",3));
        studentSet.add(new Student("Rohit",4));

        System.out.println(studentSet);

        studentSet.add(new Student("Mamatha",1));

        Student s1 = new Student("Mahi",1);
        Student s2 = new Student("Rohit",4);

        System.out.println(s1.equals(s2));


    }}
   /*    // Set<Integer> set = new HashSet<>();//O(1)
        //Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();//O(log n)
        //set and soreted form in binary tree

        set.add(23);
        set.add(56);
        set.add(69);
        set.add(76);

        System.out.println(set);

        set.remove(56);
        System.out.println(set);

        System.out.println(set.contains(100));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();

        System.out.println(set);




    }
}
*/