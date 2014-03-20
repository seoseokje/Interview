import java.io.*;
import java.util.*;

public class DutchFlag {

	public static void print (int[] array, String tag) {
		System.out.print(tag + " ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println("");
	}

	public static void align(int[] array, int a, int b) {
		int left = 0;
		int right = array.length - 1;

		while (left < right) {			
			if (array[left] == b && array[right] == a) {
				array[left] = a;
				array[right] = b;
			}
			if (array[left] != b) left++;
			if (array[right] != a) right--;
		}
	}

	public static void test (int[] array) {
		
		print(array, "initial");

		align(array, 1, 2);
		print(array, "12 aligned");
		
		align(array, 0, 2);
		print(array, "02 aligned");

		align(array, 0, 1);
		print(array, "01 aligned");
	}
	
	public static void main (String[] args) {
		int size = Integer.parseInt(args[0]);
		int[] array = new int[size];
		Random rr = new Random();
		for (int i = 0; i < size; i++) {
			array[i] = rr.nextInt(3);
		}
		test(array);		
	}
}
