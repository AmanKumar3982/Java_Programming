public class Q3{
    public static void main(String[] args) {
        try {
            
            try {
                
                String str = null;
                System.out.println(str.toString());
            } catch (NullPointerException e) {
                
                System.out.println("Null Pointer Exception caught in inner try block");
            }
        } catch (Exception e) {
            
            System.out.println("Generic exception caught in outer try block");
        }
    }
}