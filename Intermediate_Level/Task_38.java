import java.util.Scanner;

public class Task_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com sua palavra: ");
        StringBuilder reversedWord = new StringBuilder();
        String word = scanner.next();
        scanner.close();
        
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord.append(word.charAt(i));
        }
        System.out.println(reversedWord);
    }
}
