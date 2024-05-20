import java.lang.String;
import java.util.*;
public class q2 {
   public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.print("Enter string1: ");
        String a = ac.nextLine();
        System.out.println("Enter string2: ");
        String b = ac.nextLine();
        String string1 = a.replace(" ", "");
        String string2 = b.replace(" ", "");
        char[] arr1 = new char[string1.length()];
        char[] arr2 = new char[string2.length()];
        if(string1.length() == string2.length()){
            int i = 0;
            while(i < string1.length()){
                arr1[i] = string1.charAt(i);
                arr2[i] = string2.charAt(i);
                i++;
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1, arr2)){
                System.out.println("yes it is an anagram");
            }
        }else{
            System.out.println("it is not anagram");
        }
    }
}
