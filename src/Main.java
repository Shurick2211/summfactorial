import java.math.BigInteger;

public class Main {
  public static void main(String [] args) {
    // Input a number for factorial
    int number = 100;
    //  Calculate the factorial
    BigInteger rezult = BigInteger.ONE;
    for (int i = 1; i <= number; i++){
      rezult = rezult.multiply(BigInteger.valueOf(i));
    }
    // Get array digits
    char [] nums = rezult.toString().toCharArray();
    // Calculate the sum
    int sum =  0;
    for (char n:nums) sum += Integer.parseInt(n+"");
    // Display the sum
    System.out.println(sum);
  }
}
