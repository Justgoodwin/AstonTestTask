import java.util.ArrayList;
import java.util.Scanner;

public class IntegerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива:\t");
        int size = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            System.out.print("Введите елемент массива:\t");
            arrayList.add(scanner.nextInt());
        }
        for (int element : arrayList) {
            if (element % 3 == 0) {
                System.out.println("Число кратное трём: " + element);
            }
        }
    }
}
