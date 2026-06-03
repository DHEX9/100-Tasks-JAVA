import java.util.Scanner;

public class Task_13 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Entre com seu ano:");
        int ano = scanner.nextInt();
        scanner.close();

        if(ano%4 == 0 && (ano%100 != 0 || ano%400 == 0)){
            System.out.println("Bissexto");
        }
        else{
            System.out.println("Não Bissexto");
        }
    }
}