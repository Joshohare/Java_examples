public class UIQuestion {
	public static void main(String[] args) {
		String name =
			javax.swing.JOptionPane.showInputDialog("What is your name?");
		System.out.println(name);
		javax.swing.JOptionPane.showMessageDialog(null, name,"I'm saying Hello " + name, 1);
	}
}