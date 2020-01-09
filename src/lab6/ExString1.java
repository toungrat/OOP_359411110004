package lab6;

public class ExString1 {

    //String เป็นคลาสใน java library
    //จะมี method ที่ object ของ String สามารถเรียกใช้ได้
    public static void main(String[] args) {
        String msg = "Toungrat Mingkam";

        int len =msg.length(); //length ใช้ในการนับความยาวของข้อความ แล้วส่งค่ากลับมาเป็นจำนวนเต็ม
        System.out.println("length of name:"+len);

        System.out.println(msg.toUpperCase()); //toUpperCase() แปลงทุกตัวอักษรเป็นพิมพ์ใหญ่
        //concatenation String (การต่อ string)
        String fName="Toungrat";
        String lName="Mingkam";
        String fullName = fName+lName;

        System.out.println(fullName);
        //2.method concat()
        String fullName2=fName.concat(lName);
        System.out.println(fullName2);

        //Compara String
        String p="Hello";
        String q="hello";
        String x=p;

        if (p==q) System.out.println("yes.");
        else System.out.println("no.");
                System.out.println(p==q?"yes.":"no.");
        System.out.println(p==x?"yes.":"no.");

        System.out.println(p.equals(q)?"yes.":"no.");
        System.out.println(p.equals(x)?"yes.":"no.");

        System.out.println(p.compareTo(q)==0?"yes.":"no.");
        System.out.println(p.compareTo(x)==0?"yes.":"no.");
    }
}
