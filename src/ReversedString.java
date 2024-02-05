import java.util.Scanner;
public class ReversedString {
    public static void main(String[] args) {

        //Create a program that prompts the user to enter a string using Java’s Scanner class.
        Scanner scanner = new Scanner(System.in);
        String rev = "";


        System.out.println("\n\n" + "Type a word to use ReverseString" + "\n\n");
        rev = scanner.nextLine();


        //Store the user input in a String variable.
        String reverse = "";


        //Use a loop to reverse the string.
        for(int i =rev.length()-1; i>=0; i--)

        {
            reverse = reverse + rev.charAt(i);
        }


        //Display the reversed string to the user.
        System.out.println("Here you go: " + reverse);

    }

}
