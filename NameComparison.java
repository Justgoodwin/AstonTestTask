import java.util.Scanner;

public class NameComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя:\t");

        while (true) {
            String inputName = scanner.next();

            if (inputName.equals("Вячеслав")) {
                System.out.println("Привет,\s" + inputName);
                break;
            }
            else {
                System.out.println("Нет такого имени");
                System.out.print("Введите имя:\t");
            }
        }
    }
}
