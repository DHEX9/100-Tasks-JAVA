import java.util.Scanner;

public class Task_22 {
    public static void main(String[] args){
        System.out.print("Digite dois números e um operador (+, -, *, /): ");
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble(), num2 = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        scanner.close();

        switch(operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            
            case '-':
                System.out.println(num1 - num2);
                break;

            case '*':
                System.out.println(num1 * num2);
                break;
            
            case '/':
                if(num2 != 0){
                    System.out.println(num1 / num2);
                }
                else{
                    System.out.println("Erro: Divisão por zero");
                }
                break;
                
            default:
                System.out.println("Operador inválido.");
                break;
        }
        
    }
}