public class Demo {
    public static void main(String[] args) {
        SingleLinkedListInteger<Integer> intList = new SingleLinkedListInteger<>();

        intList.add(23);
        intList.add(34);
        intList.add(98);
        intList.add(675);
        intList.add(44);
        intList.add(567);

        System.out.println(intList);

        System.out.println("\nsize: " + intList.size());

        System.out.println( intList.find(98));

        System.out.println("maximum is : " +intList.max());
        System.out.println("minimum is : " +intList.min());


    }
}
