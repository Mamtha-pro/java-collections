package genericsAndWrapperClasses;

public class BoxMain {
    public static void main(String[] args) {
        BoxClassPractices<Integer> b1 = new BoxClassPractices<>();
        BoxClassPractices<String> b2 = new BoxClassPractices<>();

        b1.store(10);
        b2.store("Mahi");
        System.out.println(b1.bring());
        System.out.println(b2.bring());

    }
}
