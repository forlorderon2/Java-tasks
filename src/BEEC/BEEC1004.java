import java.util.Scanner;

public class BEEC1004 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int production = A * B;

        System.out.println("PROD = " + production);

    }
}