package NgonNguJava.BaiTap;

import java.util.Scanner;

public class StnNhoHon100 {
    public static void main(String[] args) {
        int n = 100;
        for(int i=0;i<=n;i++){
            boolean flag = true;
            if (i<2){
                flag = false;
            }
            else
                for(int j=2;j<=Math.sqrt(i);j++){
                    if (i%j==0){
                        flag = false;
                    }
                }
            if(flag){
                System.out.println(i);
            }
        }
    }
}
