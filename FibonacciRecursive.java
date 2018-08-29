import java.util.Arrays;

public class FibonacciRecursive implements Fibonacci {
	public int fibonacci(int n){

		int sum = 0; 
		/* If 1, 0 just return 1, 0 -- known vals */
		if(n <= 1) {
			return n;
		} else {
			/* Add function call to prev. 2 numbers until fib(0), fib (1) is reached */
			sum = fibonacci(n-1) + fibonacci(n-2);
		}

		return sum;

	}
}