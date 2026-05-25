import java.util.Scanner;

public class Task_8 {

    static Scanner scanner = new Scanner(System.in);

    // Solução 1
    public static void main(String[] args){

        System.out.println("Digite uma palavra:");

        String palavra = scanner.next();
        String invertido = new StringBuilder(palavra).reverse().toString();

        if(palavra.equalsIgnoreCase(invertido)){
            System.out.println("Palíndromo");
        }
        else{
            System.out.println("Não Palíndromo");
        }
        
    // Solução 2

        
    }
}
