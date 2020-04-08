package MangVaPhuongThuc.ThucHanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static double doiCsangF(double C){
        double F = (9.0 / 5) * C + 32;
        return F;
    }
    public static double doiFsangC(double F){
        double C = (5.0 / 9) * (F - 32);
        return C;
    }

    public static void main(String[] args) {
        double C,F;
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu"+"\n1.Doi tu do C sang do F" +"\n2.Doi tu do F sang C"+"\n3.Exit"+"Choose");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhap Do C");
                    C = scanner.nextDouble();
                    System.out.println("Do F la "+doiCsangF(C));
                    break;
                case 2:
                    System.out.println("Nhap Do F");
                    F = scanner.nextDouble();
                    System.out.println("Do C la "+doiFsangC(F));
                    break;
                case 3:
                    System.exit(0);
            }
        }while (choice != 0);
    }
}
