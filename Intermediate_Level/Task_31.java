import java.util.Arrays;
import java.util.Scanner;

public class Task_31 {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o primeiro array: ");

        String[] arr_str1 = scanner.nextLine().trim().split("\\s+");

        System.out.print("Entre com o segundo array: ");
        String[] arr_str2 = scanner.nextLine().trim().split("\\s+");
        scanner.close();

        int[] merge = new int[arr_str1.length + arr_str2.length];

        for(int i = 0; i < arr_str1.length; i++){
            merge[i] = Integer.parseInt(arr_str1[i]);
        }
        
        for(int i = 0; i < arr_str2.length; i++){
            merge[arr_str1.length + i] = Integer.parseInt(arr_str2[i]);
        }
        System.out.println(Arrays.toString(merge));
        
    }
}
