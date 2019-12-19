package lab3;

import java.util.Scanner;

public class loop3 {
    public static void main(String[] args) {
        //while : ใช้กรณีที่ไม่ทราบจำนวนครั้งหรือรอบที่แน่นอน ใช้โปรแกรมทำซ้ำไปเรื่อยๆจะกว่าเงื่อนที่เป็นเท็จ
        Scanner sc=new Scanner(System.in);
        int x =1;
        while (x !=0){
            System.out.print("Enter integer:");
            x=sc.nextInt ();
        }
        System.out.println("Goog bye.");
    }
}
