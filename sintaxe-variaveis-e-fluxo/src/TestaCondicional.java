
public class TestaCondicional {
	
	public static void main(String[] args) {		
		System.out.println("Testando condicionais:");
		
		int idade = 16;
		int quantidadePessoas = 1;
		
		if(idade>= 18) {
			System.out.println("Voce tem mais de 18 anos");
			System.out.println("Voce pode entrar!");
		}else {
			if(quantidadePessoas>=2) {
				System.out.println("Voce nao tem 18, mas esta acompanhado, "
						+ "ent�o voc� pode entrar");
			} else {
				System.out.println("Voce nao pode entrar!");				
			}
		}
		
	}
}
