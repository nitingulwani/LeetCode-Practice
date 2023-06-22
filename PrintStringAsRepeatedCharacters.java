//a3b4c5 gives aaabbbbccccc
import java.util.*;
import java.lang.*;

    public class PrintStringAsRepeatedCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isLetter(currentChar)) {
                if (i + 1 < input.length() && Character.isDigit(input.charAt(i + 1))) {
                    int count = Character.getNumericValue(input.charAt(i + 1));

                    for (int j = 0; j < count; j++) {
                        output.append(currentChar);
                    }

                    i++; // Skip the next character since it has already been processed
                }
            }
        }

        System.out.println(output.toString());
    }
}
