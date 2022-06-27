
public class TestaCondicional2 {
 
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		
		int idade = 21;
		int quantidadePeassoas = 2;
		boolean  acompanhado = quantidadePeassoas >=2;
		
		System.out.println("O Valor de acompanhado é: " + acompanhado);
		if(idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		}
		else {
				System.out.println("você não pode entrar");
		}
	}
}
