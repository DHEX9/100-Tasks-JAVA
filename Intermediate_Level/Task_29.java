import java.util.Arrays;
import java.util.Scanner;

public class Task_29 {
    static boolean swap(String str1, String str2){
        int menorTamnhao;

        if (str1.length() < str2.length()){
            menorTamnhao = str1.length();
        }
        else{
            menorTamnhao = str2.length();
        }

        for(int i = 0; i < menorTamnhao; i++){
            if(str1.charAt(i) > str2.charAt(i)){
                return true;
            }
            else if(str1.charAt(i) < str2.charAt(i)){
                return false;
            }
        }
        return str1.length() > str2.length();
    }
    public static void main(String[] args){
        System.out.print("Entre seu array de palavras: ");

        Scanner scanner = new Scanner(System.in);
        String[] arr_str = scanner.nextLine().trim().split("\\s+");
        scanner.close();

        //Sem Arrays.sort(arr_str1) e Sem .CompareTo(0);
        for(int i = arr_str.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(swap(arr_str[j], arr_str[j+1])){
                    String aux = arr_str[j+1];
                    arr_str[j+1] = arr_str[j];
                    arr_str[j] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(arr_str));
    }
}
