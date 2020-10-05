package repeticao;

import javax.swing.JOptionPane;

public class DesafioRepeticao {

	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero 1"));
		int numero2 = 0;
		int tentativa = 0;
		do {
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Numero 2"));
			
			if (numero2 > numero1)
				System.out.println("Informe um numero menor !!");
			else
				if (numero2 < numero1)
					System.out.println("Informe um numero maior !!");

			tentativa++;
		} while (numero1 != numero2);
		
		System.out.println("Voc� acertou o numero " + numero1 + " em " + tentativa + " tentativas !!");
	}

}