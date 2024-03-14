// WAP to check whether a static method can access the instance variable or not ?

public class Q4 {
    public static String str = "JUST_AN_EXAMPLE";

    public static void getStr() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        getStr();
    }
}