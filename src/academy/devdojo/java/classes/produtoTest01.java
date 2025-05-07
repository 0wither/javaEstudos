
// se arquivo tiver na mesma pasta , não precisa importar, se tiver dentro de outra class precisa importar
package academy.devdojo.java.classes;

import academy.devdojo.java.classes.obejects.produto;

public class produtoTest01 {
	public static void main(String[] args) {
		produto arroz = new produto();
		produto bolo  = new produto();
		produto boloDeCereja = new produto();
		
		
				
		arroz.price = 14;
		arroz.tipo = "alimento";
		
		bolo.price = 20;
		bolo.tipo = "alimento";
		
		boloDeCereja = bolo;

		System.out.println("------Arroz------");
		System.out.println(arroz.price +"\n"+ arroz.tipo);
		System.out.println("------Bolo------");
		System.out.println(bolo.price +"\n"+ bolo.tipo);
		System.out.println("------BoloDeCereja------");
		System.out.println(boloDeCereja.price +"\n"+ boloDeCereja.tipo);
		
	}
}
