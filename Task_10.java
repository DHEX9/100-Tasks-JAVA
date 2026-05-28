import java.util.ArrayList;
import java.util.Scanner;

public class Task_10 {

    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args){

        ArrayList<Integer> nums = new ArrayList<>();
        String linha = scanner.nextLine();
        scanner.close();
        String[] partes = linha.trim().split("\\s+");

        for(String p : partes){
            nums.add(Integer.parseInt(p));
        }

        nums.sort(null);

        System.out.println(nums);
    }
}
