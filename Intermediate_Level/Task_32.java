import java.util.Scanner;

public class Task_32 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com seu array: ");
        String[] arr_str = scanner.nextLine().trim().split("\\s+");

        System.out.print("Entre com seu alvo: ");
        String target = scanner.next();
        scanner.close();

        for(int i = 0; i < arr_str.length; i++){
            if(arr_str[i].equals(target)){
                System.out.println("Índice: " + i);
                return;
            }
        }
        System.out.println("-1");
    }
}
