package MangVaPhuongThuc.ThucHanh;

import java.util.Scanner;

public class DaoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap kick thuoc mang");
            size = scanner.nextInt();
            if(size>5){
                System.out.println("qua kich thuoc");
            }
        }while (size>5);
        arr = new int[size];
        int i = 0;
        while (i<arr.length){
            System.out.println("Nhap phan tu "+(i+1)+" : ");
            arr[i]=scanner.nextInt();
            i++;
        }
        System.out.println("Cac phan tu trong mang la :");
        for (int j = 0; j <arr.length ; j++) {
            System.out.println(arr[j]+"\t");
        }
        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        
    }
}
