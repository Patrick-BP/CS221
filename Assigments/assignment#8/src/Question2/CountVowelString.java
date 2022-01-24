package Question2;

import java.util.Locale;

public class CountVowelString {
    public static void main(String[] args) {
        System.out.println(countvowel("patrick"));

    }
    public static int countvowel(String str){
        int count =0;
        char c ;
        str = str.toLowerCase();
        if (str.length() < 1 ) return 0;
        else
            c = str.charAt(0);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            count++;
        }

        return count + countvowel(str.substring(1));
    }
}
