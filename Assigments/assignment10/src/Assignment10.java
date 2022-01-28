import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class Assignment10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dean");
        list.add("Dave");
        list.add("Zaineh");
        list.add("Yasmeen");
        list.add("Dean");

        System.out.println(list);

        System.out.println(noDeplicate(list));

        System.out.println(countDistinctElements(list));

        String[] arr1 = {"Dean", "Dave", "Zaineh"};
        int[] arr2 = {90 , 80 , 94};

        System.out.println(mapStructure(arr1 , arr2));

    }

    public static Set  noDeplicate(List list){
        Set<String> setlist = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            setlist.add((String) list.get(i));
        }
        return setlist;
    }
    public static int  countDistinctElements(List list){
        Set<String> setlist = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
           setlist.add((String) list.get(i));

        }
        return setlist.size();
    }
    public static Map mapStructure(String[] arr1, int[] arr2){
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], arr2[i]);

        }
        return map;
    }
    //public static
}
