//create a multiplication table system from 1 x 1 to 12 x 12
public class MultiplicationTable {
    public static void main(String[] args) {
        int i, j; //declaring i and j as integers

        System.out.println("My Multiplication Table");
        for ( i = 1; i<=15; i++) {           //i looping
            for ( j=1; j<=15 ;j++) {         //j looping
                System.out.println(i + " * " + j + " = " + i*j);        //output
            }
        }
    }
}
