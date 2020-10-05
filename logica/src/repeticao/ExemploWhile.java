package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		String email = "";
		
		while (email.contains("@")==false)
		{
			email = JOptionPane.showInputDialog("Email".toLowerCase());
		}
		
		System.out.println("Email " + email);
	}

}
