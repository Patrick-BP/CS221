package Question1;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
    IntegerRandomArray randArray = new IntegerRandomArray();


    System.out.println("=========== inserting 50 random numbers ================\n");

    randArray.insert();

    System.out.println("\n=========== remove all duplicates ================\n");

    randArray.removeDuplicates();

    System.out.println("\n=========== replacing an element ================\n");

    randArray.set(10,34);

    System.out.println("\n=========== get a element ================\n");

    System.out.println(randArray.get(10));

    System.out.println("\n===========  subList ================\n");

    randArray.subList(2,5);

    System.out.println("\n=========== remove all elements ================\n");

    randArray.clear();


    }
}
