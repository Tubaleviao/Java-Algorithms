

public class Execute{
	public static void main(String[] args){
		
		// madhav array
		madhav();

		/*
		
		int[] x7 = {12, 11, 4, 9, 2, 3, 10};
		int[] x8 = {11, 4, 20, 9, 2, 8};
		int[] x9 = {1};
		int[] x10 = {2};
		int[] x11 = {1,2,3,4};
		int[] x12 = {1,1,1,1,1,1,2};
		int[] x13 = {2,12,4,6,8,11};
		int[] x14 = {2,12,12,4,6,8,11};
		int[] x15 = {-2,-4,-6,-8,-11};
		int[] x16 = {2,3,5,7};
		Three third = new Three();
		
		System.out.println(third.isInertial(x7)); // 0
		System.out.println(third.isInertial(x8)); // 1
		System.out.println(third.isInertial(x9)); // 0
		System.out.println(third.isInertial(x10)); // 0
		System.out.println(third.isInertial(x11)); // 0
		System.out.println(third.isInertial(x12)); // 1
		System.out.println(third.isInertial(x13)); // 1
		System.out.println(third.isInertial(x14)); // 1
		System.out.println(third.isInertial(x15)); // 0
		System.out.println(third.isInertial(x16));// 0
		

		Four fourth = new Four();
		int[] i = {11,5,4,20};
		System.out.println(fourth.countSquarePairs(i));
		int[] j = {9,0,2,-5,7};
		System.out.println(fourth.countSquarePairs(j));
		int[] k = {9};
		System.out.println(fourth.countSquarePairs(k));

		

		Five fifth = new Five();
		int a = 140;
		System.out.println(fifth.findPorcupineNumber(a));
		//System.out.println(fifth.isPrime(139));

		

		Six sixth = new Six();
		int[] t1 = {8,4,2,1};
		System.out.println(sixth.isGuthrieSequence(t1));
		int[] t2 = {8,17,4,1};
		System.out.println(sixth.isGuthrieSequence(t2));
		int[] t3 = {8,4,1};
		System.out.println(sixth.isGuthrieSequence(t3));
		int[] t4 = {8,4,2};
		System.out.println(sixth.isGuthrieSequence(t4));
		*/
	}

	public static void madhav(){
		Madhav test = new Madhav();
		int[] x1 = {2,1,1};
		int[] x2 = {2,1,1,4,-1,-1};
		int[] x3 = {6,2,4,2,2,2,1,5,0,0};
		int[] x4 = {18,9,10,6,6,6};
		int[] x5 = {-6,-3,-3,8,-5,-4};
		int[] x6 = {0,0,0,0,0,0,0,0,0,0,1,1,1,-2,-1};
		int[] x7 = {3,1,2,3,0};
		System.out.println(test.isMadhavArray(x1));
		System.out.println(test.isMadhavArray(x2));
		System.out.println(test.isMadhavArray(x3));
		System.out.println(test.isMadhavArray(x4));
		System.out.println(test.isMadhavArray(x5));
		System.out.println(test.isMadhavArray(x6));
		System.out.println(test.isMadhavArray(x7));
	}

	public static void primeCount(){
		PrimeCount test = new PrimeCount();
		System.out.println(test.primeCount(1,1));
		System.out.println(test.primeCount(5,5));
		System.out.println(test.primeCount(6,2));
		System.out.println(test.primeCount(-10,6));
	}
}