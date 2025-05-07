package academy.devdojo.java.metodos.construtores;

public class characterTest01 {
	public static void main(String[] args) {
	character guerreiro = new character("kratos", 100, 6);
	character boss = new character("wither");
	character nullo = new character();
	
	guerreiro.imprime();
	boss.imprime();
	nullo.imprime();
	}
}
