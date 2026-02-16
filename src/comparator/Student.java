package comparator;

public class Student {
   public int id;
   public String name;

   public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

