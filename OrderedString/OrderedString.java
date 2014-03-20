import java.io.*;

public class OrderedString {

	public static void printAllOrderedString(String b, int currentOrder, int depth) {
		if (depth == 0) {
			System.out.println(b);
			return;
		}
		for (int i = currentOrder; i < 26; i++) {
				char a = (char)((int)'a' + i);
				printAllOrderedString(new StringBuilder(b).append(a).toString(), i, depth - 1);
				a = Character.toUpperCase(a);
				printAllOrderedString(new StringBuilder(b).append(a).toString(), i, depth - 1);
		}		
	}

	public static void printAllOrderedString(int num) {
		printAllOrderedString("", 0, num);
	}

	public static void main(String[] args) {
		printAllOrderedString(Integer.parseInt(args[0]));
	}
}