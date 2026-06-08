import java.util.Scanner;

public class Task_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com sua frase: ");
        String setence = scanner.nextLine();
        scanner.close();
        int count = 0;

        for (int i = 0; i < setence.length(); i++){
            if(setence.charAt(i) != ' ' && (i == 0 || setence.charAt(i - 1) == ' ')){
                count++;
            }
        }
        System.out.println(count);
    }
}
