//create a simple calculator that does basic arithmetic operations
import java.util.Scanner;
public class SimpleCalculator{
    public static void main(String[] args) throws InterruptedException { //throws InterruptedException was added due to the Thread.sleep

        Scanner num = new Scanner(System.in);
        System.out.println("choose a function: ");
        System.out.println(" 1 - Add \n 2- subtraction \n 3- multiplication \n 4- division \n 5- remainder");
        int choice = num.nextInt();

        while (choice <1 || choice >5){
            System.out.println("you entered an invalid number");
            Thread.sleep(1000); //this line delays the next output by 1 second (1000 = 1sec)
            System.out.println("enter a valid number");
            choice = num.nextInt();


            //System.exit(0); if it exceeds, code ends
        }

        System.out.println("Input first Number: ");
        int firstNumber = num.nextInt();
        System.out.println("Input second Number: ");
        int secondNumber = num.nextInt();

        int result = switch (choice) {
            case 1 -> firstNumber + secondNumber;
            case 2 -> firstNumber - secondNumber;
            case 3 -> firstNumber * secondNumber;
            case 4 -> firstNumber / secondNumber;
            case 5 -> firstNumber % secondNumber;
            default -> 0;
            //System.out.println("The addition is: " + (firstNumber + secondNumber));
        };
        //we output the result
        System.out.println("the result is; " + result);
    }
}

//the first way I did the switch before the system corrected it to the one above
    /*int result = 0;
        switch (choice) {
                case 1:
                result = firstNumber + secondNumber;
                break;
                case 2:
                result = firstNumber - secondNumber;
                break;
                case 3:
                result = firstNumber * secondNumber;
                break;
                case 4:
                result = firstNumber / secondNumber;
                break;
                case 5:
                result = firstNumber % secondNumber;
                break;
                     */