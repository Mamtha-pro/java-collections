package collectioninterface;

import java.util.*;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Mahi",2));
        list.add(new Student("Ravi",4));
        list.add(new Student("Kavitha",3));
        list.add(new Student("Rohit",1));

        Student s1 = new Student("Mahi",2);
        Student s2 = new Student("Rohit",3);
        System.out.println(list);
      //  System.out.println(s1.compareTo(s2));
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o1.name.compareTo(o2.name);
                    }
                });

       /* List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(87);
        list.add(24);
        list.add(62);
        list.add(18);
        list.add(15);*/

      /*  System.out.println("minimium element" + Collections.min(list));
        System.out.println("maximium element" + Collections.max(list));
        System.out.println(Collections.frequency(list, 15));

        Collections.sort(list);// ascending order
        Collections.sort(list,Comparator.reverseOrder());//descending order*/
    }
    }



