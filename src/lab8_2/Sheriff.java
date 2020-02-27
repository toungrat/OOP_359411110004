package lab8_2;

public class Sheriff extends person {

    private String WorkState;

    public Sheriff(String name, String bornYear, String workState) {
        super(name, bornYear);
        WorkState = workState;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I'm Sheriff,I Working at "+this.WorkState);
    }

    public String getWorkState() {
        return WorkState;
    }

    public void setWorkState(String workState) {
        WorkState = workState;
    }
}
