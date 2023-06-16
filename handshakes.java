import java.util.Scanner;

class Handshakes {
    static int count = 0;
    // static int x = 0;

    public static int doHandshakes(int n) {
        for (int i = 1; i < n; i++) {
            count += i;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = doHandshakes(n);
        System.out.println(result);
    }
}
