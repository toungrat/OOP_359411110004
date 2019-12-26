package lab4;
//เขียนโปรแกรมเพื่อรับค่าจำนวนจริง 2 ค่า
//จากนั้นแสดงผล บวก ลบ คูณ หาร โดยการใช้ method

import java.util.Scanner;

public class method2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an number 1:");
        double x = sc.nextDouble();
        System.out.print("Enter an number 2:");
        double y = sc.nextDouble();

        double z = plus(x,y);
        System.out.println(x+"+"+y+"="+z);
        double v = minus(x,y);
        System.out.println(x+"-"+y+"="+v);
        double w = times(x,y);
        System.out.println(x+"*"+y+"="+w);
        double s = divided(x,y);
        System.out.println(x+"/"+y+"="+s);
    }

    private static double divided(double x, double y) {
        return x/y;
    }

    private static double times(double x, double y) {
        return x*y;
    }

    private static double minus(double x, double y) {
        return x-y;
    }

    private static double plus(double x, double y) {
        return  x+y;
    }
}
