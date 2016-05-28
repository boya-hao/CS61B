public class LeapYear {
	public static void LeapYear (int y) {
		if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) {
			System.out.println (y + " year is leap year");
		} else {
			System.out.println (y + " year is not leap year");
		}

	}
	public static void main(String[] args) {
		LeapYear(Integer.parseInt(args[0]));
	}
}