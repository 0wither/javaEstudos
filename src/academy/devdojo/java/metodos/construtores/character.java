package academy.devdojo.java.metodos.construtores;

//usando sobrecarga de metodos

public class character {
	private String name;
	private int hp ; 
	private int dano ;
	
	
	public character(String name,int hp, int dano) {
		this.name = name;
		this.hp = hp;
		this.dano = dano;
		System.out.println("personagem criado");
	}
	
	public character(String name) {
		this(name, 10,3);
	}
	public character() {
		this("Entity",10,2);
	}
	
	
	public void imprime() {
		System.out.println("name : "+ this.name);
		System.out.println("atack : "+ this.hp);
		System.out.println("dano : "+ this.dano);
		System.out.println("------------------------------");
	}
}
