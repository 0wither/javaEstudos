package academy.devdojo.java.induction;

//array multidimensionais inicialização

public class aula07 {
	public static void main(String[] args) {
		
		//declarando array e inicializando	
		int[][] arrayInt2 = {{0,0}, {1,2,3}, {1,2,4,5,7}}; 
		int[] array = {1,2,3};
		//declarando array
		int[][] arrayInt = new int[3][];
		
		
		
		//inicalização
		arrayInt[0] = new int[4];
		arrayInt[1] = array;
		arrayInt[2] = new int []{1,2,3,4,5,5,6};
		
		
		
		for (int[] arrayBase: arrayInt) {
			System.out.println("----");
			for (int num: arrayBase) {
				System.out.print(num + " ");
			}
			
		}
		
	}
}	
