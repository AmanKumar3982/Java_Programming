public class E5Q5 {
    E5Q5(int a, int b){
        System.out.println("Done Multiplication : " + (a * b));
    }

    E5Q5(int a, int b, int c){
        System.out.println("Done Multiplication : " + (a*b*c));
    }

    E5Q5(int[] data){
        int mul = 1;
        for(int i : data){
            mul = mul * i;
        }
        System.out.println("Done Multiplication : " + mul);
    }
    public static void main(String[] args){
        E5Q5 user = null;
        if(args.length==2){
            user = new E5Q5(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        }

        if(args.length==3){
            user = new E5Q5(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        }

        if((args.length > 3 || args.length < 2) && args.length!=0){
            int[] data = new int[args.length];
            int x = 0;
            for(String i : args){
                data[x] = Integer.parseInt(i);
                x++;
            }
            user = new E5Q5(data);
        }
        System.out.println(args.length);
    }
}
