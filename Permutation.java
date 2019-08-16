import java.util.Arrays;
import java.util.ArrayList;

public class Permutation{

  public static ArrayList<String> permutation(int[] arr){
    ArrayList<String> all = new ArrayList();
    return execute(arr, arr.length, all);
  }
  
  public static ArrayList<String> execute(int[] arr, int n, ArrayList<String> all){
    if(n == 1){
      all.add(Arrays.toString(arr));
    }else{
      execute(arr, n-1, all);
      for(int i=0; i<n-1; i++){
        if(n%2 == 0){ // even
          swap(arr, i, n-1);
        }else{ // odd
          swap(arr, 0, n-1);
        }
        execute(arr, n-1, all);
      }
    }
    return all;
  }
  
  public static void swap(int[] arr,int p1,int p2){
    int tmp = arr[p1];
    arr[p1] = arr[p2];
    arr[p2] = tmp;
  }
}