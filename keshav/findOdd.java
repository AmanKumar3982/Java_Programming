public class findOdd {
    
    findOdd(int[] data){
        int len = data.length;

        for(int i = 0; i < len; i++){
            if(data[i]%2==0){
                System.out.println(data[i] + " is Odd.");
            }
        }
    }
    public static void main(String[] args){
        int[] data = {10,7,2,9,6,15,8};
        findOdd fo = new findOdd(data);
    }
}
