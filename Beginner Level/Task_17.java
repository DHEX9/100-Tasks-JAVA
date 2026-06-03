import java.util.Scanner;

public class Task_17 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        
        System.out.println("Entre com uma sequência de números:");
        String[] partes = scanner.nextLine().trim().split("\\s+");
        scanner.close();

        int maior = Integer.parseInt(partes[0]);

        for(int i = 1; i < partes.length; i++){
            int num = Integer.parseInt(partes[i]);

            if(num > maior){
                maior = num;
            }
        }
        System.out.println("Maior número: " + maior);
    }
}
