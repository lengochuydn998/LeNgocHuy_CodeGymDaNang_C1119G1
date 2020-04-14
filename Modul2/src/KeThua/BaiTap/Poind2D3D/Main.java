package KeThua.BaiTap.Poind2D3D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập X:");
        float X=scanner.nextInt();
        System.out.println("Nhập Y:");
        float Y=scanner.nextInt();
        System.out.println("Nhập Z:");
        float Z=scanner.nextInt();
        Point2D point2D = new Point2D();
        point2D.setXY(X,Y);
        System.out.println(point2D.toString());
        Point3D point3D = new Point3D();
        point3D.setXYZ(X,Y,Z);
        System.out.println(point3D.toString());
    }
}
