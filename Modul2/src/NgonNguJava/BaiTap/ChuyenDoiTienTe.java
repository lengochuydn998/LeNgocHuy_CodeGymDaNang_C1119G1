package NgonNguJava.BaiTap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        System.out.println("Nhap So USD muon chuyen doi :");
        Scanner scanner = new Scanner(System.in);
        int usd = scanner.nextInt();
        double vnd = 23000*usd;
        System.out.println("Tien VND :"+vnd);
    }
}
