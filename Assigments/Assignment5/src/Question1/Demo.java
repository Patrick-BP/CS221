package Question1;

public class Demo {

    public static void main(String[] args) {
        KWLinkedList<String> list = new KWLinkedList<>();
        list.add("jhon");
        list.add("paul");
        list.add("eggie");
        list.add("claude");
        list.add("paul");
        list.add("smith");


        System.out.println(list);
        list.removeAllOf("paul");
        System.out.println(list);
    }

}
