
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		
		int idade = 11;
		int pessoaAcompanhada = 1;
		
		if(idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
		}
		else {
			if(pessoaAcompanhada >= 2) {
			System.out.println("Voc� pode entrar, pois est� acompanhado");
			}
			else {
				System.out.println("voc� n�o pode entrar");
			}
	}
}
}