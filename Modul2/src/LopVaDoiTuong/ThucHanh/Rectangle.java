package LopVaDoiTuong.ThucHanh;

public class Rectangle {
    double width , height ;
    public Rectangle(){
    }
    public Rectangle(double width,double height){
        this.height=height;
        this.width=width;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String display(){
        return "Rectangle{"+ "width="+width+", height=" + height + "}";
    }
}

