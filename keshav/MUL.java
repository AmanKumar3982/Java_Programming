public class MUL {
    MUL(int a, int b){
        System.out.println("Done Multiplication : " + (a * b));
    }

    MUL(int a, int b, int c){
        System.out.println("Done Multiplication : " + (a*b*c));
    }

    MUL(int[] data){
        int mul = 1;
        for(int i : data){
            mul = mul * i;
        }
        System.out.println("Done Multiplication : " + mul);
    }
    public static void main(String[] args){
        MUL user = null;
        if(args.length==2){
            user = new MUL(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        }

        if(args.length==3){
            user = new MUL(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        }

        if((args.length > 3 || args.length < 2) && args.length!=0){
            int[] data = new int[args.length];
            int x = 0;
            for(String i : args){
                data[x] = Integer.parseInt(i);
                x++;
            }
            user = new MUL(data);
        }
        System.out.println(args.length);
    }
}