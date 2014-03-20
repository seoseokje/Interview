import java.io.*;
import java.util.*;
import java.lang.*;

public class HashMapTest {

	public static int[] countOccerence(String string, String target) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < string.length(); i++) {
			if (map.containsKey(string.charAt(i))) {
				map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
			}
			else map.put(string.charAt(i), 1);
		}
		int[] result = new int[target.length()];
		for (int i = 0; i < target.length(); i++) {
			if (map.containsKey(target.charAt(i))) {
				result[i] = map.get(target.charAt(i));
			}
			else 
				result[i] = 0;
		}
		return result;

	}

	public static void main (String[] args) {
		int[] r = countOccerence("abcdefdfaevfabbccdfaefadavaseafd", "abc");
		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i]);
		}
	}

}