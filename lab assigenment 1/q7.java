import java.util.Scanner;
public class q7 {
    String name;
    int group;
    String reg_no;
    String branch;
    public q7(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter name : ");
        name = sc.nextLine();
        System.out.print("Enter REG.NO : ");
        reg_no = sc.nextLine();
        System.out.print("Enter branch : ");
        branch = sc.nextLine();
        System.out.print("Enter Group : ");
        group = sc.nextInt();
    }
    public void display_details(){
        System.out.println("NAME = "+name);
        System.out.println("GROUP = "+group);
        System.out.println("REg.NO = "+reg_no);
        System.out.println("BRANCH = "+branch);
    }
    public static void main(String[] args) {
        q7 object=new q7();
        object.display_details();
    }
}
