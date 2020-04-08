package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class GiaiPtBacNhat {
    public static void main(String[] args) {
        System.out.println("Cho 1 pt bac 1");
        System.out.println("ax+b=c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a:");
        float a = scanner.nextFloat();
        System.out.println("Input b:");
        float b = scanner.nextFloat();
        System.out.println("Input c:");
        float c = scanner.nextFloat();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }

    }
}
