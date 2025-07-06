package A9_StringBuilder;

public class A13_MaxValue {
    public static void main(String[] args) {
      String[] arr = { "455363896","746745","69321"};
      int mx = Integer.parseInt(arr[0]);
      for( int i =1;i<arr.length;i++){
          int n = Integer.parseInt(arr[i]);
          mx = Math.max(mx,n);
      }
        System.out.println(mx);
    }
}
