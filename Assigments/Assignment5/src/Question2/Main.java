package Question2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student(122, "john", 98);
        Student std2 = new Student(322, "smith", 97);
        Student std3 = new Student(522, "paul", 69);
        Student std4 = new Student(622, "jane", 76);

        List<Student> list = new ArrayList<>();

        list.add(std1);
        list.add(std2);
        list.add(std3);
        list.add(std4);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
