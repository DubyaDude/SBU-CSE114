import java.util.*;
class TheDistribute{
	public static void main(String[] args){
		int array[] = new int[15];
		Scanner input = new Scanner(System.in);
		int index;
		
		for (int i = 0; i < array.length; i++)
			array[i] = (int) (1 + (Math.random() * 12));
		
		System.out.println("The random values in array are: " + Arrays.toString(array));
		System.out.print("Enter the index: ");

		index = input.nextInt();
		distribute(array,index);

		System.out.println("\nValues after modification:      " + Arrays.toString(array));
	}

	static void distribute(int array[], int index){
		int count = array[index];
		array[index] = 0;
		for(int i = 1;i<=count;i++) {
			if(index+i<=array.length-1)
				array[index + i] += 1;
			else
				array[(i + index)-array.length] += 1;
		}
	}
}