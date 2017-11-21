public class Driver {
	public static void main(String[] args) {
		GeometricObject[] array = new GeometricObject[5];
		array[0] = new Square();
		array[1] = new Triangle();
		array[2] = new Square();
		array[3] = new Triangle();
		array[4] = new Square();

		for (int i = 0; i < array.length; i++) {
			if (array[i] instanceof Colorable) {
				Square sqr = (Square) array[i];
				sqr.howToColor();
			}
		}

	}
}
