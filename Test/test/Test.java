package test;

import java.io.*;

public class Test {
	public static void main (String[] args) {
		System.out.println("using other class in the same package");
		TestSecond ts = new TestSecond();
		System.out.println(ts.tt);
	}
}