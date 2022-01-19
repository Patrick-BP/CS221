package Question3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        String name1 = o1.getSname();
        String name2 = o2.getSname();
        int id1 = o1.getSid();
        int id2 = o2.getSid();
        if(name1.compareTo(name2) !=0){
            return name1.compareTo(name2);
        }
        return (id1 - id2)*-1;
    }
}
