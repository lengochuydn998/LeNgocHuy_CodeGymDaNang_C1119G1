package MangVaPhuongThuc.ThucHanh;

import java.util.Scanner;

public class NhietDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius ;
        int choice;
        do {
            System.out.print("Menu.\n"+"1.Fahrenheit to Celsius\n"+"2.Celsius to Fahrenheit\n"+"0. Exit"+
                    "\nEnter the choice");
            choice = input.nextInt();
            switch (choice){
                case 1 :
                    break;
                case 2 :
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);
    }
}
