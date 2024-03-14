public class alpha_pattern {
    public static void main(String[] args) {
        int n = 20;
        char value = 'A';
        for(int i = 0; i < n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(value + " ");++value;
            }
            System.out.println("");
            value = 'A';
        }
        System.out.println("\n");
        int val = 65;
        for(int i = 0; i < n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print((char)val + " ");++val;
            }
            System.out.println("");
            val = 65;
        }
    }

}
