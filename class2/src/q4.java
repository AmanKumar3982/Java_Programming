import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        // String NAME= "AMAN KUMAR";
        // int G = 6;
        // String REG="2201020583";
        // String ROLL="CIT22094";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String NAME= sc.nextLine();
        System.out.println("Enter Group: ");
        int G = sc.nextInt();
        System.out.println("Enter Reg.no: ");
        long REG=sc.nextLong();
        System.out.println("Enter Roll no: ");
        String ROLL=sc.nextLine();
        System.out.println("NAME: "+NAME+"\nGROUP: "+G+"\nReg_no: "+REG+"\nRoll_no: "+ROLL);
    }
}
