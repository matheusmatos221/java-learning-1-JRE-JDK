
public class TestaLacos2 {
	public static void main(String[] args) {
		int limiteTriangulo = 50;
		
		for(int linha = 0; linha < limiteTriangulo; linha++) {
			for(int coluna = 0; coluna < limiteTriangulo; coluna++) {
				if(coluna > linha) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
