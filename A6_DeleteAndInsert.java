package A9_StringBuilder;

public class A6_DeleteAndInsert {
    public static void main(String[] args) {
     StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);// abcef
        System.out.println(sb.charAt(3));
        sb.append("xyz");
        System.out.println(sb); // abcefxyz  , cefx (2,5)
        sb.delete(2,6); // deletes characters from 2 to 5
        System.out.println(sb); // abyz
        sb.insert(2,'g');
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);



    }
}
