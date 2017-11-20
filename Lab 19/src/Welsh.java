import java.util.*;

public class Welsh {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a Welsh word:");
		String word = input.nextLine();
		System.out.println("Welsh Letters");
		System.out.println(welshLetters(word));

	}

	public static ArrayList<String> welshLetters(String word) {
		ArrayList<String> output = new ArrayList<String>();

		int i = 0;
		while (i < word.length()) {
			if (i + 1 >= word.length()) {
				output.add("" + word.charAt(i));
				break;
			}
			char c1 = word.charAt(i);
			char c2 = word.charAt(i + 1);

			if (isDigraph("" + c1 + c2)) {
				output.add("" + c1 + c2);
				i += 2;
			} else {
				output.add("" + c1);
				i++;
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
