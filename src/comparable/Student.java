package comparable;

import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // compareTo method
    public int compareTo(Student s) {
        return this.id - s.id; // sort by id
    }

    // display
    public String toString() {
        return id + " " + name;
    }
}

