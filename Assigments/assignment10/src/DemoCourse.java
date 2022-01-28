import java.util.*;

public class DemoCourse {
    private static Course e;

    public static void main(String[] args) {
        Course course1 = new Course("CS221","DS",5);
        Course course2 = new Course("CS201","OOP",6);
        Course course3 = new Course("CS205","Procedural Programing",4);

        Course[] list = {course1, course2,course3};
        System.out.println(list);
        for (Course e: list) {
            System.out.println(e);
        }

        System.out.println(extract(list));

    }

    public static Map extract(Course[] arr){
        Map<String, Course> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

           String data = arr[i].getcID();
            Course value =arr[i];
           map.put(data, value);
        }

        return map;

        }



    }



