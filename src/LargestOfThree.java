import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {

        //Imported a Scanner and labeled it scan
        Scanner scan = new Scanner(System.in);

        //Enter the 1st number
        System.out.println("Enter the 1st number" + "\n");
        int x1 = scan.nextInt();

        //Enter the 2nd number
        System.out.println("Enter the 2nd number" + "\n");
        int x2 = scan.nextInt();

        //Enter a 3rd number
        System.out.println("Enter the 3rd number" + "\n");
        int x3 = scan.nextInt();

        //Great than for x1 and x2
        if (x1 > x2)
            if (x1 > x3)
                System.out.println("The largest number is: " + x1);

        //If x2 is greater than x1 and x3
        if (x2 > x1)
            if (x2 > x3)
                System.out.println("\n" + "The largest number is: " + x2);

        //If x3 is greater than x1 and x2
        if (x3 > x1)
            if (x3 > x2)
                System.out.println("\n" + "The largest number is: " + x3);

    }

}
