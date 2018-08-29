public class FactorialRecursive implements Factorial {
	public int factorial(int n){

		/* If <= 1, factorial is just 1 or 0 */
		if(n <= 1){
			return n;
		} else {
			/* Reverse to get to fact(0) and fact(1) = 0, 1, then multiply by n */
			return n * factorial(n-1);
		}
	}
}