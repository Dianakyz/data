public class Main {
    public static void main(String[] args) {
    boolean good = Data.validate("test", "test", "test1");
    if (good) {
        System.out.println("Данные верны");
    } else {
        System.out.println("Данные не верны");
    }
    }

    //
}