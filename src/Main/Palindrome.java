package Main;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        if (isPalindrome(A))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean isPalindrome(String word) {
        String aux = "";
        int maxPosition = word.length() - 1;

        for (int i = maxPosition; i >= 0 ; i--) {
            aux += word.substring(i, i + 1);
        }

        if (word.equalsIgnoreCase(aux))
            return true;
        else
            return false;
    }
}
