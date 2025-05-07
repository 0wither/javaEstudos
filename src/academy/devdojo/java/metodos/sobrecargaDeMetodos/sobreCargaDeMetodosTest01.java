package academy.devdojo.java.metodos.sobrecargaDeMetodos;

public class sobreCargaDeMetodosTest01 {
	
	
    
	public static void main(String[] args) {
		
		sobreCargaDeMetodos01 sobreCarga = new sobreCargaDeMetodos01();
		
		int num1 = 32;
		int num2 = 31;
		
		
		double num3 = 54;
		double num4 = 51;
		
		
		
		
		System.out.println(sobreCarga.somar(num1,num2) + "\n");
		System.out.println(sobreCarga.somar(num3,num4) + "\n");
		System.out.println(sobreCarga.somar(num1,num2,num1));
		
		
	}
	
}
