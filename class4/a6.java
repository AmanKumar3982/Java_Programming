import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        int marks[]=new int[5];
        int tm = 0;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks : ");
            marks[i]=s.nextInt();
            tm+=marks[i];
        }
        if(tm>500){
            System.out.println("invalid inputs");
        }

        if (tm<=500&&tm>=400){
            System.out.println("Grade O "+ tm);
        }
        else if (tm<=400&&tm>=300) {
            System.out.println("Grade E "+tm);
        }
        else if (tm<=300&&tm>=200) {
            System.out.println("Grade A"+tm);
        }
        else if (tm<=200&&tm>=100) {
            System.out.println("Grade B "+tm);
        }
    
        else{
            System.out.println("Grade C"+tm);
        }
    }
}
