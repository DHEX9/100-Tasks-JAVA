import java.util.Scanner;

public class Task_27 {
    public static void main(String[] args){
        System.out.print("Entre com sua palavra: ");
        Scanner scanner = new Scanner(System.in);
        char[] word = scanner.next().toCharArray();
        scanner.close();
        
        for(int i = 0; i < word.length; i++){
            int count = 0;
            boolean repetido = false;

            for(int j = 0; j < i; j++){
                if(word[i] == (word[j])){
                    repetido = true;
                    break;
                }
            }
            
            if(!repetido){
                for(int k = 0; k < word.length; k++){
                    if(word[i] == word[k]){
                        count++;
                    }
                }
                System.out.println(word[i] + " : " + count);
            }
        }
    }
}
  
