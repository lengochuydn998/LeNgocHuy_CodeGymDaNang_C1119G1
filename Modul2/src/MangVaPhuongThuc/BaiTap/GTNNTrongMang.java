package MangVaPhuongThuc.BaiTap;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class GTNNTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang");
        int size = scanner.nextInt();
        int []array = new int[size];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Nhap phan tu thu "+ (i+1) +" :");
            array[i]= scanner.nextInt();
        }
        int min = array[0];
        int index = 0;
        for (int i = 1; i <array.length ; i++) {
            if(array[i]<min){
                min = array[i];
                index = i;
            }
        }
        System.out.println("Gia tri nho nhat la : "+min+" tai vi tri "+index);
    }
}
