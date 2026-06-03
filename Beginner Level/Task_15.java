import java.util.Scanner;

public class Task_15 {

    static Scanner scanner = new Scanner(System.in);

    static void validEntry(String input){

        char unit = input.charAt(input.length() -1);

        if(input.length() < 2 || (unit != 'C' && unit != 'F')){
            System.out.println("Formatação inválida");
            System.exit(1);
        }
    }

    public static void main(String[] args){

        System.out.println("Formato: xC/xF");
        System.out.println("Entre com o valor para a conversão:");
        
        String input = scanner.next().toUpperCase();
        String str_num; 
        char unit; int num;

        validEntry(input);

        unit = input.charAt(input.length() -1);
        str_num = input.substring(0, input.length() -1);
        num = Integer.parseInt(str_num);

        if(unit == 'C'){
            num = ((num * 9) / 5) + 32;
            System.out.println(num + "°F");
        }
        else{
            num = ((num - 32) * 5) / 9;
            System.out.println(num + "°C");
        }
        scanner.close();
    }
} 
