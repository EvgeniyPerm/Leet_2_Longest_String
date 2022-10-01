import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution solution = new Solution()
                ;
        int n = solution.lengthOfLongestSubstring(s);
        System.out.println(n);
    }
}