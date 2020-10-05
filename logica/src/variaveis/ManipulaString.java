package variaveis;

import javax.swing.JOptionPane;

public class ManipulaString {

	public static void main(String[] args) {

		String email = JOptionPane.showInputDialog("Email");
		System.out.println("Original  " + email);
		System.out.println("Minusculo " + email.toLowerCase());
		System.out.println("Maiuscula " + email.toUpperCase());
		System.out.println("Posicao do @ " + email.indexOf("@"));
		System.out.println("Existe @? " + email.contains("@"));
		System.out.println("Quantidade caracteres " + email.trim().length());
		System.out.println("Do 2 ao 4 " + email.trim().substring(1, 4));
		System.out.println("A partir do 2 " + email.trim().substring(1));
		System.out.println("Usuario " + email.trim().substring(0, email.trim().indexOf("@")));
		System.out.println("Servidor " + email.trim().substring(email.trim().indexOf("@") + 1));
		System.out.println("Servidor P " + email.trim().substring(email.indexOf("@") +1, email.indexOf(".com.br")));
		System.out.println("Metade " + email.substring(0, email.length() / 2));
		System.out.println("Comparação com Case Sensitive " + (email.equals("rogrock@ig.com.br")));
		System.out.println("Comparação sem Case Sensitive " + (email.equalsIgnoreCase("rogrock@ig.com.br")));
	}

}
