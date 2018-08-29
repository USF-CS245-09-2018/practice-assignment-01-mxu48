public class FactorialIterative implements Factorial {
	public int factorial(int n){

		/* Must start at 1, no fact for 0 */
		int val = 1;

		/* Iterate to multiply factorial val up to n beginning from 1 */
		for(int i = 1; i <= n; i++){
			val = val * i;
		}

		return val;

	}
}