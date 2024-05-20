public class Q4 {
    public static void main(String[] args){
		
		try {
			int a = 10;
			int b = 0;
			System.out.println("a / b = " + (a / b));
		} catch (Exception e) {
			System.out.println("Error occured.");
		}
		finally{
			System.out.println("Hey, developers.");
		}
	}
}
