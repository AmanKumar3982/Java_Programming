
import java.util.*;

public class q3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row :");
        int xSize = sc.nextInt();
        System.out.println("Enter the size of column :");
        int ySize = sc.nextInt();
        System.out.println("Enter the size of depth :");
        int zSize = sc.nextInt();

        
        int[][][] threeDArray = new int[xSize][ySize][zSize];

        System.out.println("enter data: ");
        
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                for (int k = 0; k < zSize; k++) {
                    threeDArray[i][j][k] = sc.nextInt();
                }
            }
        }

        
        System.out.println("Three Dimensional Array:");
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                for (int k = 0; k < zSize; k++) {
                    System.out.println("Array[" + i + "][" + j + "][" + k + "] = " + threeDArray[i][j][k]);
                }
            }
        }
    }
}
