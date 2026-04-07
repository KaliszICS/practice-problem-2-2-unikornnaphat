public class PracticeProblem {

	public static void main(String args[]) {
    
    System.out.println("isEven Test 1: " + isEven(4));
	System.out.println("isEven Test 2: " + isEven(7));
	System.out.println("isEven Test 3: " + isEven(0));
	System.out.println("isEven Test 4: " + isEven(100));
	System.out.println("isEven Test 5: " + isEven(-3));

	System.out.println();

	System.out.println("isOdd Test 1: " + isOdd(5));
	System.out.println("isOdd Test 2: " + isOdd(8));
	System.out.println("isOdd Test 3: " + isOdd(0));
	System.out.println("isOdd Test 4: " + isOdd(-7));
	System.out.println("isOdd Test 5: " + isOdd(2));

	System.out.println();

	System.out.println("isPositive Test 1: " + isPositive(10.5));
	System.out.println("isPositive Test 2: " + isPositive(-5.0));
	System.out.println("isPositive Test 3: " + isPositive(0.0));
	System.out.println("isPositive Test 4: " + isPositive(0.0001));
	System.out.println("isPositive Test 5: " + isPositive(-100.0));

	System.out.println();

	System.out.println("combinedLength Test 1: " + combinedLength("Hello", "World"));
	System.out.println("combinedLength Test 2: " + combinedLength("", ""));
	System.out.println("combinedLength Test 3: " + combinedLength("A", "B")); 
	System.out.println("combinedLength Test 4: " + combinedLength("Java", "Fun"));
	System.out.println("combinedLength Test 5: " + combinedLength("Hi", "There"));
	}

	public static boolean isEven(int num) {
        return num % 2 == 0;
    }

	public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

	public static boolean isPositive(double num) {
        return num > 0;
    }

	public static int combinedLength(String str1, String str2) {
        return str1.length() + str2.length();
    }
}
