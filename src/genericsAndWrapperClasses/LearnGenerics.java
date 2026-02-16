package genericsAndWrapperClasses;

import java.util.ArrayList;

public class LearnGenerics {
    public static void main(String[] args) {
        Dog<String,String> d1 = new  Dog<>("mamatha","Leo");
        Dog<String,String> d2 = new  Dog<>("Aswitha","123");
        Dog<String,Integer> d3 = new  Dog<>("Arathi",989);
        System.out.println(d3.getId());
        ArrayList<Integer> a= new ArrayList<>();
    }

}

class Dog<E, V>{
    E id;
    V name;
    public Dog(E id, V name){
        this.id = id;
    }
    E getId(){
        return id ;

    }
}
