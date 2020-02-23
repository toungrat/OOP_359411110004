package lab7;

public class mobileStore {
    public static void main(String[] args) {
        mobile mobile1= new mobile
                ("1001","Wiko","Sunny4plus",2090,"Android9Go");

        System.out.println(mobile1.getId());
        System.out.println(mobile1.getBrand());
        System.out.println(mobile1.getModel());
        System.out.println(mobile1.getPrice());
        System.out.println(mobile1.getOs());

        //change
        mobile1.setPrice(1500);
        System.out.println(mobile1.toString());

    }
}
