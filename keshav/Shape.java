class square{
    int side;
    void takeValue(int side){
        this.side = side;
    }
    void perimeter(){
        System.out.println("Perimeter square : " + 4*side);
    }
    void area(){
        System.out.println("Area square : " + side * side);
    }
}

class rectangle extends square{
    int length;
    int breadth;
    void takeValue(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
        super.takeValue(10);
    }
    void perimeter(){
        System.out.println("Perimeter : " + 2*(length*breadth));
        super.perimeter();
    }

    void area(){
        System.out.println("Area rectangle : " + length*breadth);
        super.area();
    }
}

public class Shape{
    public static void main(String[] args) {
        rectangle user = new rectangle();
        user.takeValue(5,10);
        user.perimeter();
        user.area();
    }
}