package academy.devdojo.java.induction;


//foreach


public class aula04 {
	public static void main(String[] args) {
		
		// declarando array sem declarar valor
		int[] numeros = new int[3];
		//declarando array, apenas incializar array, Ê ele sera inicializado sozinho
		int[] numeros2 = {1,2,3};
		
		
		for (int num: numeros2) {
			System.out.println(num);
		}
	}
}
