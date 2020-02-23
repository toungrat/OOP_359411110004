package lab8;

public class Person {
    //Attributes
    private  String pid;
    private String name;
    private String dateofbirth;
    //constructor


    public Person(String pid, String name, String dateofbirth) {
        this.pid = pid;
        this.name = name;
        this.dateofbirth = dateofbirth;
    }

    //getter and setter


    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
    public void running(){
        System.out.println("I am running");
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid='" + pid + '\'' +
                ", name='" + name + '\'' +
                ", dateofbirth='" + dateofbirth + '\'' +
                '}';
    }
}
