import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int count = 1;
        String star = "*"; 
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= count; j++){
                System.out.print(star);
            }
            System.out.println();
            count++;
        }
        
    }
}