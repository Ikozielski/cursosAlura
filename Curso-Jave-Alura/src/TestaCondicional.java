
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		
		int idade = 11;
		int pessoaAcompanhada = 1;
		
		if(idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
		}
		else {
			if(pessoaAcompanhada >= 2) {
			System.out.println("Você pode entrar, pois está acompanhado");
			}
			else {
				System.out.println("você não pode entrar");
			}
	}
}
}