package Question3;

import Question2.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        Student2 std1 = new  Student2(122, "chadia", 98);
        Student2 std2 = new  Student2(322, "chadia", 97);
       Student2 std3 = new  Student2(522, "alain", 69);
        Student2 std4 = new  Student2(622, "paul", 76);
        Student2 std5 = new  Student2(322, "zaina", 66);

        List<Student2> list = new ArrayList<>();
        StudentComparator stdcomp = new StudentComparator();
        list.add(std1);
        list.add(std2);
        list.add(std3);
        list.add(std4);
        list.add(std5);

        System.out.println(std4.equals(std5));

        System.out.println(list);
        Collections.sort(list, stdcomp);
        System.out.println(list);
    }
}
