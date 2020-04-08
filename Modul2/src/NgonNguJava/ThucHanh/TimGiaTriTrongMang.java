package NgonNguJava.ThucHanh;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"huy","quy","viet","trieu","hung"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 1 ten hoc sinh");
        String input_name = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i <students.length ; i++) {
            if(input_name.equals(students[i])){
                System.out.println("Vi tri cua sinh vien trong mang "+input_name+" la"+(i+1));
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("khong tim thay sinh vien"+input_name+"trong mang");
        }
    }
}
