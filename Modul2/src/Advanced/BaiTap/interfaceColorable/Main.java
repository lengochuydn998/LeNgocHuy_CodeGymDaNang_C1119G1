package Advanced.BaiTap.interfaceColorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5, "blue", true);
        shapes[1] = new Square(4.5,"red",false);
        shapes[2] = new Rectangle("green",true);
        for (Shape item:shapes) {
            System.out.println(item);
            if (item instanceof Colorable){
                ((Colorable) item).howToColor();
            }
        }
    }
}