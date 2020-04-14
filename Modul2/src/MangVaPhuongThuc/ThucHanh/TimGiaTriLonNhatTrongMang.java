package MangVaPhuongThuc.ThucHanh;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        do {
            System.out.println("Nhap kich thuoc mang ");
            size = scanner.nextInt();
            if(size>20){
                System.out.println("Vuot qua kich thuoc quy dinh");
            }
        }while (size>20);
            arr = new int[size];
            int i=0;
            while (i<arr.length){
                System.out.println("Phan tu thu "+(i+1)+" : ");
                arr[i]=scanner.nextInt();
                i++;
            }
        System.out.println("Cac phan tu trong mang la:");
        for (int j = 0; j <arr.length ; j++) {
            System.out.println(arr[j]+"\t");
        }
        int max = arr[0];
        int index = 1;
        for (int j = 1; j <arr.length ; j++) {
            if(arr[j]>max){
                max = arr[j];
                index = j+1;
            }
        }
        System.out.println("gia tri lon nhat la "+max +" tai vi tri"+ index);
    }
}
