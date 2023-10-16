import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Convert the input to lowercase for case insensitivity
        input = input.toLowerCase();

        // Use a set to store unique characters from A to Z
        Set<Character> alphabetSet = new HashSet<>();
        
        // Iterate through the input and add alphabets to the set
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabetSet.add(ch);
            }
        }
        
        // Check if the set contains all 26 alphabets
        return alphabetSet.size() == 26;
    }
}

