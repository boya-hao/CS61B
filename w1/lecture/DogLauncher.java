public class DogLauncher {
	public static void main(String[] args) {
		/* declariation Dog maya
		instantiation new Dog(15)
		assignment Dog maya = new Dog(15); */
		Dog maya = new Dog(30);
		/* invocation of the Dog class's method */
		maya.makeNoise();

		/* create an array of two dogs */
		Dog[] someDogs = new Dog[2];
		someDogs[0] = new Dog(10);
		someDogs[1] = new Dog(105);

		someDogs[0].makeNoise();

		Dog tiny = new Dog(5);
		Dog larger = Dog.maxDog(maya, tiny);
		larger.makeNoise();

		Dog larger2 = tiny.maxDogComparedToMe(maya);
		larger2.makeNoise();

	}

}