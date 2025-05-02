package academy.devdojo.java.classes.obejects;
public class fnProduto {
	public void imprime(produto Produto) {
		System.out.println(Produto.price);
		System.out.println(Produto.tipo);
		
		Produto.price = 100;
	}
}
