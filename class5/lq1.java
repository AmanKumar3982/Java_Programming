// package class5;
// // create a program name shape create two object of shape and calculate the area and the perimeter//

import java.util.Scanner;

public class lq1 {
    double length;
    double breadth;

    public lq1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: "); 
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }

    public void calc_area_perimeter (){
        double area = length * breadth;
        double perimeter = 2*(length+breadth);
        System.out.println("\nArea: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        System.out.println("//for Shape 1//\n");

        lq1 shape1 = new lq1();
        shape1.calc_area_perimeter();
        System.out.println("\n//for shape 2//\n");
        lq1 shape2 = new lq1();
        shape2.calc_area_perimeter();
    }
}

// import java.util.Scanner;

// public class lq1 {
//     // double radius;
//     double length;
//     double breadth;
//     public lq1(){
//         Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter radius: ");
//         // int radius = sc.nextInt();
//         System.out.println("Enter length: "); 
//         length = sc.nextDouble();
//         System.out.println("Enter breadth: ");
//         breadth = sc.nextDouble();
//     }
//     public static int calc_area_perimeter (double area,double perimeter){
//         double area = length * breadth;
//         double perimeter = 2*(length+breadth);
//     }
//     public static void main(String[] args) {

        
//     }
// }
