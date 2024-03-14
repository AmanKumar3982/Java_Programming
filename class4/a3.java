public class a3 {
    public static void main(String[] args) {
        int data[]={4,5,9,6,3};
        for (int i = 0; i < 5-1; i++) {
            for (int j = 0; j < 5-1; j++) {
                if(data[j]>data[j+1]){
                    data[j]=data[j]+data[j+1];
                    data[j+1]=data[j]-data[j+1];
                    data[j]=data[j]-data[j+1];
                }
            }
        }
        for (int i = 0; i < 5; i++) {
           System.out.print(data[i]+" "); 
        }
    }
}
