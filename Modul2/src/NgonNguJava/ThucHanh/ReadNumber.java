package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class ReadNumber {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number you want to read: ");
        int number = scanner.nextInt();
        String read = "";
        int hangTram = number / 100;
        int hangChuc = (number - (hangTram * 100)) / 10;
        int hangDonVi = number - (hangChuc * 10) - (hangTram * 100);
        if (hangTram == 0 && hangChuc == 0) {
            switch (hangDonVi) {
                case 0:
                    read = "zero";
                    break;
                case 1:
                    read = "one";
                    break;
                case 2:
                    read = "two";
                    break;
                case 3:
                    read = "three";
                    break;
                case 4:
                    read = "four";
                    break;
                case 5:
                    read = "five";
                    break;
                case 6:
                    read = "six";
                    break;
                case 7:
                    read = "seven";
                    break;
                case 8:
                    read = "eight";
                    break;
                case 9:
                    read = "nine";
                    break;
            }
        } else {
            System.out.println("not resding");
        }
        System.out.println(read);
    }
}
