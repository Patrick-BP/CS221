package Question2;

public class Student implements Comparable{
    private int sid;
    private String sname;
    private int score;

    public Student(int sid, String sname, int score) {
        this.sid = sid;
        this.sname = sname;
        this.score = score;
    }

    @Override
    public int compareTo(Object o) {
        Student std = (Student)o;
        return (this.score - std.score);
    }

    @Override
    public String toString() {
        return "" + score ;
    }
}
