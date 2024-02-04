//create a system that returns even or odd number when a number is entered
import java.util.Scanner;
public class OddOrEvenNumberDetector {
    public static void main(String[] args) {

        Scanner myNum = new Scanner(System.in);
        System.out.println("enter a number: ");
        int userNum = myNum.nextInt();
        if (userNum % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}