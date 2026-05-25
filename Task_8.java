import java.util.Scanner;

public class Task_8 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        // Solução 1

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

        System.out.println("Digite uma palavra:");

        String palavra2 = scanner.next();
        StringBuilder invertido2 = new StringBuilder();

        for(int i = palavra2.length() - 1; i >= 0; i--){
            invertido2.append(palavra2.charAt(i));
        }
        
        if(palavra2.equalsIgnoreCase(invertido2.toString())){
            System.out.println("Palíndromo");
        }
        else{
            System.out.println("Não Palíndromo");
        }
    }
}
