import java.util.Arrays;

public class Inertial{
	
	public static int isInertial(int[] arr){
		int res = 1;
		// sort array
		Arrays.sort(arr); // implement your own sort
		int max= arr[arr.length-1]; // {2,12,12,4,6,8,11}
		int qtdOdds = 0;
		if(max%2 != 0){
			res = 0;
		}else{
			for(int i = 0; i<arr.length; i++){
				if(arr[i]%2 != 0){
					qtdOdds++;
					for(int j = 0; j<arr.length-1; j++){
						if(arr[j]%2 == 0 && arr[i] < arr[j]){
							res = 0;
						}
					}
				}
			}
			if(qtdOdds == 0){
				res = 0;
			}
		}
		return res;

	}

}