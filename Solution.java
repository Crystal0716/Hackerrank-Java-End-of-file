import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1; 
        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(count + " " + line);
            count++;
        }
        
        scanner.close(); 
    }
}
