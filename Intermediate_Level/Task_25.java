import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task_25 {
    public static void main(){
        System.out.println("Entre com seu array:");

        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().trim().split("\\s+");
        scanner.close();
        
        for(int i = 0; i < parts.length; i++){
            boolean repetido = false;

            for(int j = 0; j < i; j++){
                
                if (parts[i].equals(parts[j])){
                    repetido = true;
                    break;
                }
            }

            if(!repetido) {
                System.out.print(parts[i] + " ");
            }
        }
        
        System.out.println('\n');

        //Com LinkedHashSet.
        Set<String> unique = new LinkedHashSet<>();
        for(String part : parts){
            unique.add(part);
        }
        System.out.println("Com LinkedHashSet");
        System.out.println(unique);
    }
}
