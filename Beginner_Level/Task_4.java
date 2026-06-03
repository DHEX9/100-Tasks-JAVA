import java.util.Scanner;

public class Task_4 {
    static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {

		int num, unidade, invertido = 0;

	    System.out.println("Digite uma sequencia de números:");
	    num = scanner.nextInt();
	    
		while(num != 0){
			unidade = num % 10;
			num = num / 10;
			invertido = invertido * 10 + unidade;
		}
		
	    System.out.println(invertido);
		scanner.close();
	}
}
