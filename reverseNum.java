import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = sc.nextInt();

        int first = number % 10;  
        int middle = (number / 10) % 10;  
        int last = number / 100;  

        int reversedNumber = (first * 100) + (middle * 10) + last;  

        System.out.println("Reversed number: " + reversedNumber);
    }
}
