import java.io.*;

public class OrderedString {

	public static void printAllOrderedString(String b, int currentOrder, int depth) {
		if (depth == 0) {
			System.out.println(b);
			return;
		}
		for (int i = currentOrder; i < 26; i++) {
			for (int j = 0; j < 2; j++) {
				char a = (char)((int)'a' + i);
				if (j % 2 == 0) a = Character.toUpperCase(a);
				printAllOrderedString(b + a, i, depth - 1);
			}
		}		
	}

	public static void printAllOrderedString(int num) {
		printAllOrderedString("", 0, num);
	}

	public static void main(String[] args) {
		printAllOrderedString(Integer.parseInt(args[0]));
	}
}