public class Square{

	public static int countSquarePairs(int[] x){
		int qtd = 0;
		for(int i=0; i<x.length; i++){
			for(int j=0; j<x.length; j++){
				int a = x[i];
				int b = x[j];
				if(a>0 && b>0){
					if(a<b && isPerfectSquare(a+b)==1){
						qtd++;
					}
				}
			}
		}
		return qtd;
	}

	public static int isPerfectSquare(int x){
		int res = 0;
		if(Math.sqrt(x) == (int)Math.sqrt(x)){
			res = 1;
		}
		return res;
	}
}