package MangVaPhuongThuc.ThucHanh;

import java.util.Scanner;

public class DemSLSV {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap so luong ");
            size = scanner.nextInt();
            if(size>20){
                System.out.println("Qua kich thuoc");
            }
        }while (size>20);
        array = new int[size];
        int i = 0;
        while (i<array.length){
            System.out.println("Nhap diem cho hoc sinh "+(i+1)+" :");
            array[i]= scanner.nextInt();
            i++;
        }
        int count =0;
        System.out.println("Danh sach diem hoc sinh");
        for (int j = 0; j <array.length ; j++) {
            System.out.println(array[j]+"\t");
            if(array[j] >= 5&& array[j]<=10)
                count ++;
        }
        System.out.println("So luong hoc sinh vuot qua ki thi "+ count);
    }
}
