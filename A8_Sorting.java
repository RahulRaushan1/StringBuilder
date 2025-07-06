package A9_StringBuilder;

import java.util.Arrays;
public class A8_Sorting {
    public static void main(String[] args) {
        String s = "raghav";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();
        StringBuilder sb = new StringBuilder("garg");
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        for(char ele : arr){
            System.out.print(ele);
        }

    }
}
