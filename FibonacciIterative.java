import java.util.Arrays;

public class FibonacciIterative implements Fibonacci {
	public int fibonacci(int n){
	
		int sum = 0;
		int i = 0;
		/* Make list to store values */
		int[] list = new int[n+5];

		/* Conventional input to start */
		list[0] = 0; 
		list[1] = 1;

		/* Start at 2 to skip 0,1 until n is reached */
		for(i = 2; i <= n; i++) {

			/* New number is sum of previous 2 in list */
			sum = list[i-1] + list[i-2];
			/* New value at iteration i is new value sum */
			list[i] = sum;
		}

		/* Return new value at n */
		return list[n];
	}
}