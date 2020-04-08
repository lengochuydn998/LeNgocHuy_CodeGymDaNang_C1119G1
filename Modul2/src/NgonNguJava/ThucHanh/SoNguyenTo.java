package NgonNguJava.ThucHanh;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        System.out.println("Input Number Check");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number<2){
            System.out.println("k phai la so nguyen to");
        }else {
            int i=2;
            boolean check = true;
            while (i<=Math.sqrt(number)){
                if (number%i ==0 ){
                    check = false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.println(number+" la so nguyen to");
            }
            else
                System.out.println(number+" k phai la so nguyen to");
        }
    }
}
