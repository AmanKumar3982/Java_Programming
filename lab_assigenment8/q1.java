import java.lang.String;

public class q1 {
    public static void main(String[] args) {
        String a = "AMAN";
        String b = "cgu";

        String c = " AMAN CGU ";

       
        System.out.println(a+" Uppercase to lowercase: "+a.toLowerCase());


        System.out.println(b+" lowercase to uppercase: "+b.toUpperCase());
        String d = c.trim();
        System.out.println("String without space: "+ d.replace(" ", ""));
        

        
    }
}
