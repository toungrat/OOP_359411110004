package lab3;

import java.util.Scanner;

public class loop4 {
    public static void main(String[] args) {
        //do-while : ใช้ในกรณีที่ไม่ทราบจำนวนครั้งหรือรอบที่แน่นอน เช่นเดียวกับ while แต่จต่างกันที่ do-while
        //จะมีการทำคำสั่ง 1 ครั้ง จากนั้นจึงทำการตรวจสอบเงื่อไข
        Scanner sc=new Scanner(System.in);
        int x =1;
        do {
            System.out.print("Enter integer:");
            x=sc.nextInt ();
        } while (x!=0);
        System.out.println("Good bye.");
    }
}
