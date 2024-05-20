public class Q2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        try {
            int c = a / b; 
            System.out.println("Here a is divided by b: " + c);
            int[] array = new int[1]; 
            array[0] = a ; 
            System.out.println(array[1]); 
        } catch (ArithmeticException e) {
            System.out.println("This is an invalid operation: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("This is an invalid operation: " + e); 
        } catch (NullPointerException e) {
            System.out.println("This is an invalid operation: " + e);
        } finally {
            System.out.println("This is the finally block");
        }
    }
}
