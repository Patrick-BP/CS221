package Question1;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(10));
    }

    public static int decimalToBinary(int num){
        if (num == 0){
            return 0;
        }else {
            return num % 2 +10 * (decimalToBinary(num/2));
        }
    }
}
