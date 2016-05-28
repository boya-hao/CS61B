public class Dog{
	/* instance variable */
	public int size;

	/* constructor */
	public Dog(int s) {
		size = s;
	}

	public void makeNoise() {
		if (size < 20) {
			System.out.println("hideous yapping");		
		} else if (size < 50) {
			System.out.println("bark!");
		} else{
			System.out.println("arooooooo!");
		}
	}

	public static Dog maxDog(Dog d1, Dog d2) {
		if (d1.size > d2.size) {
			return d1;
		} else {
			return d2;
		}
	}

	public Dog maxDogComparedToMe(Dog otherDog) {
		if (size > otherDog.size) {
			return this;
		} else {
			return otherDog;
		}
	}
}