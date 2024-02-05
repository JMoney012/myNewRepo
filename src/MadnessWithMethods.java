import java.util.Scanner;
public class MadnessWithMethods {
    public static void main(String[] args) {

        //Using num1 and num2 to geth things going

        int num1 = getAnIntFromTheUser();
        int num2 = getAnIntFromTheUser();


        int bigNumber = compareTwoInts(num1, num2);
        int sumMath = sumTwoInts(num1, num2);


        //This will provide the larger integer
        System.out.println("\n" + "The larger number of the two entered is:  " + bigNumber);


        //Provides the sum
        System.out.println("\n" + "1st entry + 2nd entry = " + sumMath);

    }

    public static int getAnIntFromTheUser() {

        //Prompts the user to enter an integer two times
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer here: ");


        int value = scan.nextInt();


        return value;

    }

    //This will show the larger numnber
    public static int compareTwoInts (int num1, int num2) {


        if (num1 > num2) {
            return num1;
        } {
            return num2;
        }
    }

    //Takes two integers and returns sum
    public static int sumTwoInts(int num1, int num2) {


        //Return the sum of num1 + num2
        return num1 + num2;

    }
}