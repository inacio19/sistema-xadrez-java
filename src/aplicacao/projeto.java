package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import jogoTabuleiro.Posicao;

public class projeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
			
		Posicao posi = new Posicao(3, 5);
		System.out.print(posi);
			
		
		sc.close();
	}

}
