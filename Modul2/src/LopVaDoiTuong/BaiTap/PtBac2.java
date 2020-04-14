package LopVaDoiTuong.BaiTap;

import java.util.Scanner;

public class PtBac2 {
    private double a,b,c;

    public PtBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public PtBac2() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        return this.b*this.b-4*this.a*this.c;
    }
    public double getRoot1(){
        return (-this.b+Math.pow(getDiscriminant(),0.5))/(2*a);
    }
    public double getRoot2(){
        return (-this.b-Math.pow(getDiscriminant(),0.5))/(2*a);
    }
    public double getRoot3(){
        return -b/(2*a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Co pt bac 2: ax2 + bx + x = 0 ");
        System.out.println("Nhap a");
        double a = scanner.nextDouble();
        System.out.println("Nhap b");
        double b = scanner.nextDouble();
        System.out.println("Nhap c");
        double c = scanner.nextDouble();
        PtBac2 ptBac2 = new PtBac2(a,b,c);
        double delta = ptBac2.getDiscriminant();
        if(delta > 0){
            System.out.println("pt co 2 nghiem: x1 = "+ptBac2.getRoot1()+" x2 = "+ptBac2.getRoot2());
        }
        else if (delta == 0){
            System.out.println("pt bac 2 co ngiem la: "+ptBac2.getRoot3());
        }
        else
            System.out.println("Phuong trinh vo nghiem");
    }
}
