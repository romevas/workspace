package decisao;

import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Collections;

public class Exercicio4 {

	public static void main(String[] args) {
		Integer[] valores = {0, 0, 0};
		byte ix = 0;

		while (ix<3)
		{
			try
			{
				valores[ix] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor numero " + (ix + 1)));

				for (int iy = 0; iy < ix; iy++)
				{
					if (valores[ix].equals(valores[iy]))
						throw new Exception("Valor Repetido");
				}
				ix++;
			}
			catch (Exception ex)
			{
				System.out.println("Valor Invalido : " + ex.getMessage() );
			}
		}

		Arrays.sort(valores, Collections.reverseOrder());
			
		for (int x = 0; x <= valores.length - 1; x++)
		{
			System.out.println("Valor : " + valores[x]);
		}
		
	}

}
