public class Madhav{
	public static int isMadhavArray(int[] arr){
		int n = arr.length;
		int ret = 0;
		if(n > 0){
			ret = 1;
			int firstValue = arr[0]; 
			int sum = 0;
			int flag = 2;
			int counting = 0;
			for(int i = 1; i<n; i++){
				if(counting==flag){
					if(sum != firstValue){
						ret = 0;
					}
					flag++;
					sum =arr[i];
					counting = 1;
					
				}else{
					sum += arr[i];
					counting++;
				}
			}
			if(sum != firstValue || counting < flag){
				ret = 0;
			}
		}
		return ret;
	}
}