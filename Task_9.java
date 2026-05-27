import java.util.Scanner;

public class Task_9 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Digite uma Palavra:");

        String palavra = scanner.next().toLowerCase();
        char caractere;
        int vogais = 0, consoantes = 0;

        for(int i = palavra.length() -1; i >= 0; i--){
            caractere = palavra.charAt(i);
            
            if(Character.isLetter(caractere)){
                System.out.println("Passei aqui");
                if("aeiou".contains(String.valueOf(caractere))){
                    vogais++;
                }
                else{
                    consoantes++;
                }
            }
        }
        System.out.print("Vogais: " + vogais + ", Consoantes: " + consoantes);
        scanner.close();
    }
}