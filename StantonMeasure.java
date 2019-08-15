public class StantonMeasure{
	public static int stantonMeasure(int[] a){
		int ones = 0;
		int ns = 0;
		for(int i=0; i<a.length; i++){
			if(a[i] == 1){
				ones++;
			}
		}
		for(int j=0; j<a.length; j++){
			if(a[j] == ones){
				ns++;
			}
		}
		return ns;
	}
}