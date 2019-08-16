

public class Execute{
	public static void main(String[] args){
		
		//primeCount();
		//madhav();
		//inertial();
		//square();
		//porcupine();
		//guthrie();
		//stanton();
    //sumFactor();
    permutation();

	}
  
  public static void permutation(){
    Permutation test = new Permutation();
    int[] x1 = {1,5,4,2};
    System.out.println(test.permutation(x1));
  }
  
  public static void sumFactor(){
    SumFactor test = new SumFactor();
    int[] x1 = {3,0,2,-5,0};
    int[] x2 = {9,-3,-3,-1,-1};
    int[] x3 = {1};
    int[] x4 = {0,0,0};
    System.out.println(test.sumFactor(x1));
    System.out.println(test.sumFactor(x2));
    System.out.println(test.sumFactor(x3));
    System.out.println(test.sumFactor(x4));
  }

	public static void stanton(){
		StantonMeasure test = new StantonMeasure();
		int[] x1 = {1};
		int[] x2 = {0};
		int[] x3 = {3,1,1,4};
		int[] x4 = {1,3,1,1,3,3,2,3,3,3,4};
		int[] x5 = {};
		System.out.println(test.stantonMeasure(x1));
		System.out.println(test.stantonMeasure(x2));
		System.out.println(test.stantonMeasure(x3));
		System.out.println(test.stantonMeasure(x4));
		System.out.println(test.stantonMeasure(x5));
	}

	public static void guthrie(){
		GuthrieSequence test = new GuthrieSequence();
		int[] x1 = {8,4,2,1};
		int[] x2 = {8,17,4,1};
		int[] x3 = {8,4,1};
		int[] x4 = {8,4,2};
		System.out.println(test.isGuthrieSequence(x1));
		System.out.println(test.isGuthrieSequence(x2));
		System.out.println(test.isGuthrieSequence(x3));
		System.out.println(test.isGuthrieSequence(x4));
	}

	public static void porcupine(){
		Porcupine test = new Porcupine();
		System.out.println(test.findPorcupineNumber(130));
		System.out.println(test.findPorcupineNumber(200));
		System.out.println(test.findPorcupineNumber(500));
	}

	public static void square(){
		Square test = new Square();
		int[] x1 = {9,0,2,-5,7};
		int[] x2 = {9};
		System.out.println(test.countSquarePairs(x1));
		System.out.println(test.countSquarePairs(x2));
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