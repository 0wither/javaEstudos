package academy.devdojo.java.metodos;

public class calculadoraTest01 {
	public static void main(String[] args) { 
	caluladora calculadora = new caluladora();
	
	calculadora.soma(20,20); 
	float result = calculadora.retorno(50,50);
	System.out.println(result);
	
  }
}