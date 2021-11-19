package exceptions.runtime;

public class RuntimeExceptionNullPointerTest {

    public static void main(String[] args) {
        //Checked and Uncheked
        Object object = null;
        System.out.println(object.toString());
    }
}
