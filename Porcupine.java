public class Porcupine{
	public static int findPorcupineNumber(int n){
		int counter = (int)n;
		int pocupine = 0;
		int lastPrime = 0;
		while(pocupine == 0){
			if(isPrime(counter)){
				if(lastDigit(counter) == 9 && lastDigit(lastPrime) == 9){
					pocupine = lastPrime;
				}
				lastPrime = counter;
			}
			counter++;
		}
		return pocupine;
	}

	public static int lastDigit(int n){
		return (n%10);
	}

	public static boolean isPrime(int n){
		boolean resp = true;
		for(int i=2; i<n; i++){
			if(n%i == 0){
				resp = false;
			}
		}
		return resp;
	}
}