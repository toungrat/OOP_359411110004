package lab8;

public class personapp {
    public static void main(String[] args) {
        //create objects
          Person P1= new Person("1800800293631","TOUNGRAT","05/06/2540");
         System.out.println(P1.toString());

         Student S1=new Student("1800800296456","supakon","25/63/2540",
                 "359411110004","information system");

         S1.running();
         S1.addSubjact();
  //P1.addSubject();//object ของ super-class ไม่สามารถเรียกใช้ method ขอ' sub-class ได้
         System.out.println(S1.toString());
                S1.running();
    }
}
