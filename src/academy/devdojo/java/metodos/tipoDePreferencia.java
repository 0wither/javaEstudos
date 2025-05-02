package academy.devdojo.java.metodos;
import academy.devdojo.java.classes.obejects.produto;
import academy.devdojo.java.classes.obejects.fnProduto;
public class tipoDePreferencia {
	public static void main(String[] args) {
		
	produto arroz = new produto();
	fnProduto functionn = new fnProduto();
	
	arroz.price = 15;
	arroz.tipo = "alimento";
	
	
	functionn.imprime(arroz);
	functionn.imprime(arroz);
	System.out.println("################");
	arroz.imprime();
	}
}
