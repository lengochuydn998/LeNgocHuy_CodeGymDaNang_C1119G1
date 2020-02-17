package LopVaDoiTuong.BaiTap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public double getDiscriminant(){
        return  b*b - 4*a*c;
    }
    public double getRoob1(){
        return (-b+Math.pow(getDiscriminant(),0.5))/(2*a);
    }
    public double getRoob2(){
        return (-b-Math.pow(getDiscriminant(),0.5))/(2*a);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a");
        double a= scanner.nextDouble();
        System.out.println("Nhap b");
        double b= scanner.nextDouble();
        System.out.println("Nhap c");
        double c= scanner.nextDouble();
        
    }
}
