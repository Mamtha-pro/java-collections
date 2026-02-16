package collectioninterface;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class LearnArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);


        list.add(4);
        System.out.println(list);

        list.add(1,50);
        System.out.println(list);

        List<Integer> newList = new ArrayList();
        newList.add(150);
        newList.add(200);


        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(1));

        list.remove(1);
        System.out.println(list);

        list.remove(Integer.valueOf(3));
        System.out.println(list);

        list.set(2,1000);// update
        System.out.println(list);
        

        System.out.println(list.contains(4));

        System.out.println( list.size());

       // traverse arraylist
        for(int i = 0; i< list.size();i++) {
            System.out.println("for loop" + list.get(i));
        }

        for(Integer element : list)
        {
            System.out.println("foreach loop  " + element);
        }

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("iterator  " + it.next());
        }



       // list.clear();
        //System.out.println(list);





       // ArrayList<String> studentsName = new ArrayList<>();
       // studentsName.add("Rakesh");

        // size = n
        //size = n + n/2
    }
}