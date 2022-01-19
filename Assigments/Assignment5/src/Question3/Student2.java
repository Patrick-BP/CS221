package Question3;

import java.util.Comparator;

public class Student2 {
    private int sid;
    private String sname;
    private int score;

    public Student2(int sid, String sname, int score) {
        this.sid = sid;
        this.sname = sname;
        this.score = score;
    }

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public int getScore() {
        return score;
    }

    @Override
   public boolean equals(Object o){
        if(o == null){return false;}
        if(!(o instanceof Student2)){return false;}
        Student2 obj = (Student2) o;
        return sid == obj.sid && sname.equals(obj.sname) && score == obj.score;
   }
//    @Override
//    public int compare(Student2 o1, Student2 o2) {
//        return (o1.score - o2.score);
//    }



    @Override
    public String toString() {
        return "" + sname +" Score: "+ score  ;
    }


}
