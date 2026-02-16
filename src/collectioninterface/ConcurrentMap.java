package collectioninterface;
import java.util.concurrent.ConcurrentHashMap;
public class ConcurrentMap {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();

        map.put(1,"Java");
        map.put(2,"python");

        System.out.println(map);
    }
}
