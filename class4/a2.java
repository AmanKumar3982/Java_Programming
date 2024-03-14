import java.util.*;
public class a2 {
    public static void main(String[] args) {
        int data[]={4,5,2,2,4};
        int min = data[0], max=data[0];
        for (int i = 0; i < 5 ; i++) {
            if (min>data[i]){
                min=data[i];
                System.out.print("minimun num in array= ");
                System.out.println(min);

            }else if(max<data[i]){
                max=data[i];
                System.out.print("maximun num in array= ");
                System.out.println(max);
            }
        }
    }
}
