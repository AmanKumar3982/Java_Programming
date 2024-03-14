class inheriance1{
    int a = 23;
    int b = 32;
    public void show(){
        System.out.println("sum:"+ (a+b));
    }
}
class inheriance2 extends inheriance1{
    int a =  45;
    int b = 54;
    public void display(){
        System.out.println("difference"+ (a-b));
    }
}
public class q1{
    public static void main(String[] args){
        inheriance2 abc = new inheriance2();
        abc.display();
        abc.show();
    }

}