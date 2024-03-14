import java.util.Scanner;

class Box{
    int depth, length, breadth, km;
    float costperkm;
    Scanner sc = new Scanner(System.in);
    Box(){
        System.out.print("Enter depth, length and breadth : ");
        depth = sc.nextInt();
        length = sc.nextInt();
        breadth = sc.nextInt();

        System.out.println();
        System.out.print("Enter km to travel : ");
        km = sc.nextInt();

        System.out.println();
        System.out.print("Enter per km price : ");
        costperkm = sc.nextFloat();
    }
}


class Boxweight extends Box{
    void totalCost(){
        System.out.println("Total Cost : " + (km * (length*breadth*depth)*costperkm));
    }
}
public class E5Q4 {
    public static void main(String[] args) {
        Boxweight bxwgt = new Boxweight();
        bxwgt.totalCost();
    }
}
