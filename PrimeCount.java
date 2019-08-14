public class PrimeCount{

	static int primeCount(int start, int end){
		int total = 0;

		if(start <= end){
			for(int i = start; i <= end; i++ ){
				if(isPrime(i)){
					total++;
				}
			}
		}
		return total;
	}

	static boolean isPrime(int n){
		boolean result = false;
		if(n > 1){
			result = true;
			for(int i = 2; i<n; i++){
				if(n%i == 0){
					result = false;
				}
			}
		}
		return result;
	}
}