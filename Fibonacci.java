public class Fibonacci
{
	public static void main(String[] args)
	{
		int n = -20;																	// the nth number of the fibonacci sequence for which to calculate

		try
		{
			System.out.println(fibonacciRecursive(n));
			System.out.println(fibonacciIterative(n));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	} // end of main()

	public static int fibonacciRecursive(int n)
	{
		if (n<0)																	// validate argument
			throw new IllegalArgumentException("The Nth Fibonacci number must be positive!");

		else if (n==0 || n==1)															// base case
			return n;

		else																		// general case
			return (fibonacciRecursive(n-1) + fibonacciRecursive(n-2));

	} // end of fibonacciRecursive()

	public static int fibonacciIterative(int n)
	{
		if (n<0)																	// validate argument
		{
			throw new IllegalArgumentException("The nth Fibonacci number must be positive!");
		}
		else if (n==0 || n==1)
		{
			return n;
		}
		else
		{
			int a = 0;
			int b = 1;
			int c = 0;

			for (int i = 1; i < n; i++)
			{
				c = a + b;
				a = b;
				b = c;
			}

			return c;
		}
	} // end of fibonacciIterative()

} // end of Fibonacci
