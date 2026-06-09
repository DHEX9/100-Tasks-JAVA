import java.util.Scanner;

public class Task_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com seu exemplo: ");
        String characters = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < characters.length(); i++) {
            System.out.printf("%c: %d ", characters.charAt(i), (int)characters.charAt(i));
        }
    }
}
