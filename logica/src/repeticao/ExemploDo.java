package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {
		do {
			int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));	
			int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));	
			char opcao = JOptionPane.showInputDialog("Digite o Operador").charAt(0);

			if (opcao=='+') 
				System.out.println("Soma : " + (valor1 + valor2));
			else 
				if (opcao=='-') System.out.println("Subtra��o : " + (valor1 - valor2));
				else 
					if (opcao=='*') System.out.println("Multiplica��o : " + (valor1 * valor2));
					else 
						if (opcao=='/') System.out.println("Divis�o : " + (valor1 / valor2));
						else 
							System.out.println("Opera��o n�o conhecida");
		}
		while (JOptionPane.showInputDialog("Deseja Continuar ? ").toUpperCase().charAt(0) == 'S');

	}

}