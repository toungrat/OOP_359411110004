package lab2;

public class basicjava1 {
    public static void main(String[] args) {

        //Variables
        //integer -จำนวนเต็ม
        int x;
        x =10;
        System.out.println(x);
        int Y=-100;
        System.out.println(Y);
        int z =x+Y;  //z=?
        System.out.println(z);

        //floating - จำนวนจริง ตัวเลขที่ทศนิยม
        //float } double
        float n= 10.10f;
        System.out.println(n);
        double d = 50.55;
        System.out.println(n*d);

        //character ตัวอักษร 1 อักขระ เท่านั้น
        char c='#';
        System.out.println(c);

        //string ข้อความ คือ ตัวอักษรที่เรียงต่อกันตั้งแต่ 2 ตัวขึ้นไป
        //string เป็นคลาสใน Java ดังนั้นการประกาศตัวแปรการสร้าง Object ของคลาส
        String s="toungrat mingkam";
        System.out.println(s);
        int count= s.length();
        System.out.println(count);
        System.out.println(s.length());
        System.out.println(s.toUpperCase());

        //concatenation String การต่อ String
        String myAddress = "@SATYAI";
        String msg =s +""+ myAddress;  // msg=?

        System.out.println(msg);
        System.out.println(s.concat(""+myAddress));

        //boolean ข้อมูลที่เป็นประเภท จริง (true)และ เท็จ (false)
        boolean b = true;
        boolean r = false;
        System.out.println(b+"       "+r);













    }//main
}//class

