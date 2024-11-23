class shape{
    public double getarea(){
        return 0;
    }
}
class triangle extends shape{
    private double base;
    private double height;
public triangle(double base,double height){
    this.base=base;
    this.height=height;
}
public double getarea(){
    return 0.5*base*height;
}
}
class square extends shape{
    private double side;
    public square(double side){
        this.side=side;
    }
    public double getarea(){
        return side*side;
    }
}
class area{
    public static void main(String[] args){
        shape[] s=new shape[2];
        s[0] = new square(4);
        s[1] = new triangle(2,9);
        System.out.println("Area of Square= " +s[0].getarea());
        System.out.println("Area of Triangle= " + s[1].getarea());
    }
}