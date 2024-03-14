import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
        // int [] marks = new int[3];
        // int marks[] = new int[3];
        // int marks[]={95,45,87};
        // marks[0]=54;
        // marks[1]=84;
        // marks[2]=94;
        
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // for (int i = 0; i < 3; i++) {
        //     System.out.println(marks[i]);
        // }
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of an array:-");
        int size = sc.nextInt();
        int number[] = new int [size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("enter the element in index"+i+"= ");
            number[i]=sc.nextInt();
            
        }
        
        // for (int i = 0; i < size; i++) {
        //     System.out.print(number[i]);
        //     System.out.print(" ");
        // }
        System.out.print("Enter the element to be found :- ");

        int x = sc.nextInt();

        for (int i = 0; i < size ; i++) {
            if(number[i]==x){
                System.out.println(x+" found at index "+i);
            }
            
        }



    }
}
