import java.util.Scanner;

public class Task_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com sua frase: ");
        String setence = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < setence.length(); i++) {
            if(setence.charAt(i) != ' ' && (i == 0 || setence.charAt(i - 1) == ' ')){
                System.out.print((char)(setence.charAt(i) - 32));
            }
            else{
                System.out.print(setence.charAt(i));
            }
        }
    }
}
