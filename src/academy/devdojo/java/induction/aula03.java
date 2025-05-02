package academy.devdojo.java.induction;
//estrutura de repetição
public class aula03 {
	public static void main(String[] args) {
		int count = 1;
		boolean fome = true;
		
		// repete ate que condição seja verdadeira
		while (count < 10) {
			System.out.println("while" + count);
			count++;
		}
		
		//for serve mais para nemeros
		for(int i=0;i < 10; i++) {
			System.out.println("for" + i);
		}
		
		//executa pelo menos uma vez, se for true repete novamente
		//se for false executa e não repete
		do {
			System.out.println("test");
		}while(fome == true);
		
		
	}
}
