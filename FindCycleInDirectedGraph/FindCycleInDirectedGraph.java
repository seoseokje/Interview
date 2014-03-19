import java.io.*;
import java.util.ArrayList;

public class FindCycleInDirectedGraph {
	static int index = 0;
	public static class Vertex {
		public ArrayList<Vertex> neighborVerteces = new ArrayList<Vertex>();

		boolean isVisited = false;
		boolean isCleared = false;
		int value;
		public Vertex() {
			value = index++;
		}
	}

	public static boolean findCycleInDirectedGraph(Vertex v) {
		System.out.println(v.value);
		if (v.isVisited) return true;
		if (v.isCleared) {
			System.out.println("pruned vertex");
			return false;
		}
		v.isVisited = true;
		for (Vertex next : v.neighborVerteces) {
			if (findCycleInDirectedGraph(next)) return true;
		}
		v.isVisited = false;
		v.isCleared = true;
		return false;
	}

	public static void main (String[] args) {
		Vertex source = new Vertex();
		source.neighborVerteces.add(new Vertex());
		source.neighborVerteces.add(new Vertex());
		Vertex temp = new Vertex();
		source.neighborVerteces.get(0).neighborVerteces.add(temp);
		source.neighborVerteces.get(1).neighborVerteces.add(temp);
		temp.neighborVerteces.add(new Vertex());
		if (findCycleInDirectedGraph(source)) System.out.println("cycle detected");
		else System.out.println("cycle undetected");
	}
}