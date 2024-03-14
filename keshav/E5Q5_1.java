import java.util.Scanner;

class E5Q5_1{
    void mul(int a, int b){
        System.out.println("Method for Two numbers called- (Result) - " + a*b);
    }

    void mul(int a, int b, int c){
        System.out.println("Method for Three numbers called- (Result) - " + a*b*c);
    }

    void mul(int[] values, int nItem){
        int a = 1;
        for(int i = 0; i<nItem; i++){
            a = a*values[i];
        }
        System.out.println("Method for Multiple numbers called- (Result) - " + a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean t = true;
        int n = 100;
        int[] values = new int[n];
        int x = 0;
        int nItem = 0;

        while(t){
            System.out.print("Enter the number (Press * to stop): ");
            String data = sc.next();

            if(data.equals("*")){
                t = false;
            }
            else{
                values[x] = Integer.parseInt(data);
                x++;
                nItem+=1;
            }
        }

        E5Q5_1 user = new E5Q5_1();
        if(nItem == 2){
            user.mul(values[0], values[1]);
        }

        if(nItem == 3){
            user.mul(values[0], values[1], values[2]);
        }

        if(nItem > 3){
            user.mul(values, nItem);
        }
    }
}