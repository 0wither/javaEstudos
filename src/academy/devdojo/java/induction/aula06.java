package academy.devdojo.java.induction;

//array multidimesionais com for,forach

public class aula06 {
	public static void main(String[] args) {
		int[][] dias = new int [3][3];
		
		dias[0][0] = 20;
		dias[0][1] = 40;
		dias[0][2] = 40;
		
		dias[1][0] = 200;
		dias[1][1] = 400;
		dias[1][2] = 400;
		
		dias[2][0] = 2000;
		dias[2][1] = 4000;
		dias[2][2] = 4000;
		
		
		
		for(int i = 0; i < dias.length; i++) {
			for(int j = 0; j < dias[i].length; j++) {
				System.out.println(dias[i][j]);
			}
		}
		
		System.out.println("-------------------");
		
		for(int[] arrBase:dias) {
			for(int num: arrBase) {
				System.out.println(num);
			}
		}
	}
}
