package genericsAndWrapperClasses;

import org.w3c.dom.ls.LSOutput;

public class GenericsMethods {
    public static void main(String[] args) {
printData("hello");
printData(1234);
printData(1.456);

        GenericsMethods obj = new GenericsMethods();
        obj.doubleData(1123);
        obj.doubleData("snai");

        CustomClass custom = new CustomClass();
        obj.doubleData(custom);
    }
    static<E> void printData(E data){
    System.out.println(data);
   }
<E > void doubleData(E data){
    System.out.println(data);
       // data = 2+data;
}
}
class CustomClass{

}