package Advanced.BaiTap.interfaceColorable;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius= radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    public double getParameter(){
        return this.radius*2*Math.PI;
    }
    @Override
    public String toString(){
        return "A circle with radius"
                +this.radius
                +", which is a subclass of "
                +super.toString();
    }
}
