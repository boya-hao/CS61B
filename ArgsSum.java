public class ArgsSum {
	public static void main(String[] args) {
		int index = 0;
		int total = 0;

		while (index < args.length) {
			total += Integer.parseInt(args[index]);
			index += 1;
		}

		System.out.println(total);
	}
}

added