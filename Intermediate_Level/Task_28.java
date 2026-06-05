import java.util.Arrays;
import java.util.Scanner;

public class Task_28 {
    public static void main(String[] args){
        System.out.print("Entre com duas palavras: ");

        Scanner scanner = new Scanner(System.in);
        char[] str1 = scanner.next().toLowerCase().toCharArray();
        char[] str2 = scanner.next().toLowerCase().toCharArray();
        scanner.close();

        if(str1.length != str2.length){
            System.out.println("Não é Anagrama");
            return;
        }

        Arrays.sort(str1);
        Arrays.sort(str2);

        for(int i = 0; i < str1.length; i++){
            if(str1[i] != str2[i]){
                System.out.println("Não é Anagrama");
                return;
            }
        }
        System.out.println("É Anagrama");
    }
}
