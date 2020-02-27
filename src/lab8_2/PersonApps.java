package lab8_2;

public class PersonApps {
    public static void  mani(String[]args){

        person P1= new person("Toungrat","1997");
        person P2= new police("supakon","1998","Nakhonsitommarat");
                //object as a Police
        person P3= new Sheriff("Yanisa","1998","Thamyai");

        P1.introduce();
        P2.introduce();
        P3.introduce();


    }
}
