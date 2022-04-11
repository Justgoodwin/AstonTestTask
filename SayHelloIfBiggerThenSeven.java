import java.util.Scanner;

public class SayHelloIfBiggerThenSeven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:\t");

        while (true) {
            int inputNumber = scanner.nextInt();

            if (inputNumber == 7) {
                System.out.println("Привет");
                break;
            }
            else {
                System.out.print("Введите число:\t");
            }
        }
    }
}
