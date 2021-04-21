package e11 ;
interface Shape{
    double area();
}

interface Shape2D{
    double perimeter();
}
interface Shape3D{
    double volume();
}
class Circle2D implements Shape2D,Shape{
    private double r;
    double Carea;
    double Cper;
    public double getr(){
        return r;
    }

    @Override
    public double area() {
        return Math.PI*r*r;
    }

    @Override
    public double perimeter() {
        return Math.PI*r*2;
    }

    void fuzhi(double r){
        this.r=r;
        Carea=this.area();
        Cper= this.perimeter();
        this.print();
    }

    void print(){
        System.out.println("area is"+Carea);
        System.out.println("perimeter is"+Cper);
    }
}
class Circle3D implements Shape3D {
    private double h;
    double cVO;
    private double r;
    public double geth(){
        return h;
    }

    public double getr(){
        return r;
    }

    @Override
    public double volume() {
        return r*r*Math.PI*h;
    }
    void fuzhi(double r,double h){
        this.r=r;
        this.h=h;
        cVO=this.volume();
        this.print();
    }
    void print(){
        System.out.println("volume is"+cVO);
    }
}
class Rectangle2D implements Shape2D,Shape{
    private double x;
    private double y;
    double are;
    double pre;
    private double getx(){
        return x;
    }
    private double gety(){
        return y;
    }
    public double area(){
        return x*y;
    }
    public double perimeter(){
        return 2*(x+y);
    }
    void fuzhi(double x,double y){
        this.x = x ;
        this.y = y;
        pre= this.perimeter();
        are=this.area();
        this.print();

    }
    void print(){
        System.out.println("area is"+pre);
        System.out.println("perimeter is"+are);
    }
}
class Rectangle3D implements Shape3D{
    private double x;
    private double y;
    private double h;
    double vre;
    public double getx(){
        return x;
    }
    public double gety(){
        return y;
    }
    public double geth(){
        return  h;
    }
    public double volume(){
        return x*h*y;
    }
    void fuzhi(double x, double y, double h){
        this.x=x;
        this.y=y;
        this.h=y;
        vre=volume();
        this.print();

    }
    void print(){
        System.out.println("volume is"+vre);
    }
}
public class www1 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D();
        c1.fuzhi(5);
        Circle3D c2= new Circle3D();
        c2.fuzhi(2,4);
        Rectangle2D r1=new Rectangle2D();
        r1.fuzhi(4, 5);
        Rectangle3D r2=new Rectangle3D();
        r2.fuzhi(3,4,5);
    }
}