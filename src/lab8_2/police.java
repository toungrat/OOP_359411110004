package lab8_2;

public class police extends person {
    private  String workcontry;

    //constructoy


    public police(String name, String bornYear, String workState) {
        super(name, bornYear);
        this.workcontry = workState;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I am Police,I working at"+this.workcontry);
    }
}



