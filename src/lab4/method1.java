package lab4;

public class method1 {
    public static void main(String[] args) {
        System.out.println("Hello from main method");
        //calling method
        A();
        System.out.println("Hello fro, main method2");
        A();
        A();
        B("toungrat");
        //calling c()method
        //1.ประกาศตัวแปรชนิดเดียวกันกับค่าที่ส่งมาจากเมธอดเพื่อเก็บค่าข้อมูลนั้นไว้
        String myName = C("Toungrat","Mingkam");
        System.out.println(myName);
        //2.กรณีที่ไม่ต้องการเก็บค่าท่ส่งมาจากเมธอด สามารถแสดงค่าข้อมูลนั้นด้วยคำสั่ง print()หรือ println()ได้เลย
        System.out.println(C("Toungrat","Mingkam"));
    }
    //method type 1 : no parameter, no return value
    public static void A(){
        System.out.println("Hello from A method.");
    }
    //Method type 2 : 1 or more parameters,no return value
    public static void B (String msg) {//msg เป็น local variable หรือตัวแปรเฉพาะที่
        System.out.println("Hello from A method."+msg);

    }
    //Method type 3: 1 or more parameters,return 1 value
    public static String C(String fname,String Lname){
        System.out.println("Hello from c method.");
        String myName = fname+" "+ Lname;
        return myName;

    }
}
