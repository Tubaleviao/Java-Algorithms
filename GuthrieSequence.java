public class GuthrieSequence{

	public static int isGuthrieSequence(int[] arr){
		int resp = 1;
		int start = arr[0];
		int currentNumber = arr[0];
		for(int i=1; i<arr.length; i++){
			currentNumber = nextGuthrieNumber(currentNumber);
			if(arr[i] != currentNumber){
				resp = 0;
			}
		}
		if(currentNumber != 1){
			resp = 0;
		}
		return resp;
	}

	public static int nextGuthrieNumber(int n){
		int resp = 0;
		if(n%2==0){ // even 
			resp = n/2;
		}else{ // odd
			resp = (n*3)+1;
		}
		return resp;
	}
}