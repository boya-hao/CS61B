public class fib {
	/* recursion */
	public static int fib_r (int N) {
		if (N <= 1) {
			return N;
		} else {
			return fib_r(N - 1) + fib_r(N -2);
		}
	}

	/* iteratively */
	public static int fib_i (int N) {
		int f0 = 0;
		int f1 = 1;
		int temp;
		while (N > 0) {
			temp = f1;
			f1 = f0 + f1;
			f0 = temp;
			N -= 1;
		}
		return f0;

	}

	public static int fib2 (int n, int k, int f0, int f1) {
		if (n == k) {
			return f0;
		} else {
			return fib2(n, k + 1, f1, f0 + f1);
		}
		
	}


	public static void main(String[] args) {
		int f = fib2(8, 0, 0, 1);
		System.out.println(f);
	}
}