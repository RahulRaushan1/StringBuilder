package A9_StringBuilder;

import java.util.Scanner;

public class A3_InputStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        sb.setCharAt(1,'R');
        System.out.println(sb);


    }
}
