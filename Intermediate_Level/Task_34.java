import java.util.Scanner;

public class Task_34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();
        scanner.close();

        System.out.print("Sem replace: ");
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == ' '){
                System.out.print('-');
            }
            else{
                System.out.print(frase.charAt(i));
            }
        }
        
        System.out.print("\nCom replace: ");
        String frase_replace = frase.replace(' ', '-');
        
        System.out.println(frase_replace);
    }
}
