package Question3;

public class findcharacter {

        public static void main(String[] args) {
            System.out.println(numberOfChar("Patrick"));

        }
        public static int numberOfChar(String str){
            if(str.isEmpty())
                return 0;
            else
                return 1+ numberOfChar(str.substring(1));

        }

}
