import java.util.ArrayList;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList<Integer> squares = new ArrayList();
		for (int i = 0; i < squares.size(); i++) {
			squares.add((i), (i*i));
			squares.remove(i+1);
		}
		for (int i = 0; i < squares.size(); i++) {
			System.out.println(squares.get(i));
		}
	}
}