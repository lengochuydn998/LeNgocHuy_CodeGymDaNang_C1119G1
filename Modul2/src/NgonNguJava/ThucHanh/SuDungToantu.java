package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class SuDungToantu {
    public static void main(String[] args) {
        float wight,height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Wight: ");
        wight = scanner.nextFloat();
        System.out.println("Nhap Height: ");
        height = scanner.nextFloat();
        float area = wight*height;
        System.out.println("Area is"+area);
    }
}
