import java.util.Scanner;

public class Task_6 {
    static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) {
	    
	    int num, total = 1;
	    
		System.out.println("Digite um número:");
		num = scanner.nextInt();
		for(int i = num; i > 0; i--){
		    total *=  i;
		}
		System.out.println("Fatorial de " + num + ": " + total);
	}
}
