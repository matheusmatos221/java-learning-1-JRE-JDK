
public class TestaConversao {
	public static void main(String[] args) {
		
		//double salario = 1250.50;
		double salario = 1270.50;
		
		// Casting => Forca o valor de uma variável double 
		// em um int (pode ser usada com outros tipos)
		int valor = (int) salario;
		System.out.println(valor);
		
		float pontoFlutuante = 3.14f;
		long numeroGrande = 21025185015125151l;
		short valorPequeno = 1214;
		byte b = 120;
		
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		
		// Double para trabalhar com dinheiro nao presta muito!
		System.out.println(valor1 + valor2);
		
		
	}

}
