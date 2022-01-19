import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Mathematical Expression");
	String input = sc.nextLine();


	System.out.println(balancecheck(input));


       

    }

    public static String balancecheck(String str) {
        SymbolsStack<Character> list = new SymbolsStack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                list.push(str.charAt(i));
            } else if (str.charAt(i) == ']') {
                if (list.empty() || list.pop() != '[') {
                    return "Not Balanced";
                }
            } else if (str.charAt(i) == ')') {
                if (list.empty() || list.pop() != '(') {
                    return "Not Balanced";
                }
            } else if (str.charAt(i) == '}') {
                if (list.empty() || list.pop() != '{') {
                    return "Not Balanced";
                }


            }
        }
        String st ="y";
        if(list.empty()) {
            st = "Balanced";

        }else {
            st = "not balanced";
        }
        return st ;
    }
}