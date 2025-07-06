package A9_StringBuilder;
import java.util.Arrays;
public class A10_ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
          int z = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) z= 1;
        }
        if(z==0) System.out.println("true");
        else System.out.println("false");
    }
}