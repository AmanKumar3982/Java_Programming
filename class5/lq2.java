import java.util.Scanner;

public class lq2 {
    public static int balance = 100000;
    public static void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to be credited: ");
        int money = sc.nextInt();
        balance =  balance + money;
        System.out.println("credited: "+money );
    }
    public static void withdrawl(){
        System.out.print("Enter amount to be debited : ");
        Scanner sc = new Scanner(System.in);
        int money1 = sc.nextInt();
        if(balance  <  money1){
            System.out.println("In-sufficient Balance");
        }else{
            balance = balance - money1;
            System.out.println("Debited amount = "+money1);
        }
    }
    public static void check_balance(){
        System.out.println("Total amount : "+ balance+"\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lq2 trans = new lq2();
        
        int choice;
        do {
            System.out.println("1. Credit amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Check balance");
            System.out.println("4. Exit......\n");

            System.out.print("Enter Choice:- ");
            choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    trans.deposit();
                    System.out.println();
                    break;
                case 2:
                    trans.withdrawl();
                    System.out.println();
                    break;
                case 3 :
                    trans.check_balance();
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Exiting...");
                    sc.close();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;
            }
        } while (choice != 4);
    }
}

