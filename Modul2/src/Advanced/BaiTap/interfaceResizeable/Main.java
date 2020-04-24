package Advanced.BaiTap.interfaceResizeable;

public class Main {
    public static void main(String[] args) {
        int random = (int) Math.floor(Math.random()*10);
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(random);
        shape[1] = new Rectangle(random, random);
        shape[2] = new Square(random);
        //Trước khi thay đổi
        for (Shape item:shape) {
            System.out.println(item.toString());
        }
        //Sau khi thay đổi
        for (Shape item:shape) {
            item.resize(Math.random()*100);
            System.out.println(item.toString());

        }
    }
}
