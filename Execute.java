

public class Execute{
	public static void main(String[] args){
		
		//primeCount();
		//madhav();
		inertial();
		
		/*

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

	public static void inertial(){

		Inertial test = new Inertial();

		int[] x1 = {1};
		int[] x2 = {2};
		int[] x3 = {1,2,3,4};
		int[] x4 = {1,1,1,1,1,1,2};
		int[] x5 = {2,12,4,6,8,11};
		int[] x6 = {2,12,12,4,6,8,11};
		int[] x7 = {-2,-4,-6,-8,-11};
		int[] x8 = {2,3,5,7};
		int[] x9 = {2,4,6,8,10};
		
		System.out.println(test.isInertial(x1));
		System.out.println(test.isInertial(x2));
		System.out.println(test.isInertial(x3));
		System.out.println(test.isInertial(x4));
		System.out.println(test.isInertial(x5));
		System.out.println(test.isInertial(x6));
		System.out.println(test.isInertial(x7));
		System.out.println(test.isInertial(x8));
		System.out.println(test.isInertial(x9));
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
		System.out.println(test.primeCount(10,30));
		System.out.println(test.primeCount(11,29));
		System.out.println(test.primeCount(20,22));
		System.out.println(test.primeCount(1,1));
		System.out.println(test.primeCount(5,5));
		System.out.println(test.primeCount(6,2));
		System.out.println(test.primeCount(-10,6));
	}
}