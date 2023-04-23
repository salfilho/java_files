import java.util.Scanner;

public class VerificaLetra {

	public static void main(String[] args) {
		
		String nome;
		char teste;
		int contaVogal, contaConsoante;
		contaVogal = 0;
		contaConsoante = 0;
		
		Scanner input = new Scanner(System.in);
		for(int count=1; count <= 3; count++) {
			System.out.print("Digite o nome a ser testado:\n");
			nome = input.next();
			teste = nome.charAt(0);
			if ((teste == 'A') || (teste == 'E') || (teste == 'I')|| (teste == 'O') || (teste == 'U')) {
				contaVogal = contaVogal + 1;
			}else {
				contaConsoante = contaConsoante + 1;
			}
		}
		if ( contaVogal != 0)			
		   System.out.printf("Das palavras digitadas %d começam com vogal\n",contaVogal);
		if ( contaConsoante != 0)
			System.out.printf("Das palavras digitadas %d começam com consoante",contaConsoante);
	}

}
