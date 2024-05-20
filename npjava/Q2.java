public class Q2{
	public static void main(String[] args){
		int a = 10;
		int b = 0 ;
		
		try {
			int c = a/b;
			System.out.println("here a is divisible by b");
			
		}catch(Exception e){
			System.out.println("Invalid operation" + e);
		}finally{
			System.out.println("this is Finally block");
		}
	}
}
	