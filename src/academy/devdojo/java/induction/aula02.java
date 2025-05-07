package academy.devdojo.java.induction;

public class aula02 {
	public static void main(String[] args) {
		byte dia = 2
				;
		char sexo = 'M';
		switch(dia) {
			case 1:
				System.out.println("segunda");
				break;
			case 2: 
				System.out.println("terça");
				break;
			case 3:
				System.out.println("quarta");
				break;
			case 4: 
				System.out.println("quinta");
				break;
			case 5: 
				System.out.println("sexta");
				break;
			case 6:
				System.out.println("sabado");
				break;
			case 7:
				System.out.println("dimingo");
				break;
			default:
				System.out.println("invalido");
				break;
		}
		
		switch (sexo) {
			case 'M':  {
				System.out.println("sexo masculino");
				break;
			}
			case 'F': {
				System.out.println("sexo feminino");
			}
		}
	}
}
	
