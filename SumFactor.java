public class SumFactor{
  public static int sumFactor(int[] a){
    int res = 0;
    if(a.length > 0){
      int sum = 0;
      for(int i=0; i<a.length; i++){
        sum += a[i];
      }
      for(int j=0; j<a.length; j++){
        if(a[j] == sum){
          res++;
        }
      }
    }
    return res;
  }
}