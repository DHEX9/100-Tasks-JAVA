import java.util.Scanner;

public class Task_4 {
    static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
        
	    System.out.println("Digite uma sequencia de números:");
	    String numbers = scanner.nextLine();
	    
	    // Solução 1
	    
	    /*
	    String invertida = new StringBuilder(numbers).reverse().toString();
	    System.out.println(invertida);
	    */
	    
	    // Solução 2
	    
	    String invertida = "";
	    for(int i = numbers.length() -1; i >= 0; i --){
	        invertida += numbers.charAt(i);
	    }
	    
	    System.out.println(invertida);
	}
}
