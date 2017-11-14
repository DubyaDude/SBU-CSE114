import java.util.*;

public class Welsh {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter a welsh word:");
		String word = scn.nextLine();
		System.out.println("Welsh Letters");
		System.out.println(welshLetters(word));

	}

	public static ArrayList<String> welshLetters(String word) {
		ArrayList<String> output = new ArrayList<String>();

		int iterator = 0;
		while (iterator < word.length()) {
			if (iterator + 1 >= word.length()) {
				output.add("" + word.charAt(iterator));
				break;
			}
			char c1 = word.charAt(iterator);
			char c2 = word.charAt(iterator + 1);

			if (isDigraph("" + c1 + c2)) {
				output.add("" + c1 + c2);
				iterator += 2;
			} else {
				output.add("" + c1);
				iterator++;
			}

		}

		return output;

	}

	public static boolean isDigraph(String compare) {
		String[] digraphs = { "ch", "dd", "ff", "ng", "ll", "ph", "rh", "th" };
		boolean output = false;
		for (String digraph : digraphs) {
			if (compare.equals(digraph)) {
				output = true;
			}
		}

		return output;
	}
}
