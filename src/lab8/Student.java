package lab8;

public class Student extends  Person{
    private String sid;
    private String program;



    public Student(String pid, String name, String dateofbirth, String sid, String program) {
        super(pid, name, dateofbirth);
        this.sid = sid;
        this.program = program;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    //ToString

public  void addSubjact (){
        System.out.println("I'am addSubjact");
}
    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", program='" + program + '\'' +
                "} " + super.toString();
    }
}
