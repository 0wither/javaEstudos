package academy.devdojo.java.classes;
import  academy.devdojo.java.classes.obejects.person;
// crie uma class com seguintes atributos: age,name,com 3 salarios e imprima todos
// logo apos isso imprima total e media do salario

public class personTest01 {
	public static void main(String[] args) {
	person pessoa = new person();
	
	pessoa.setAge(19);
	pessoa.setname("nikolas");
	
	pessoa.salarios = new double[] {500,200,3500};
	
//	System.out.println(pessoa.getAge());
//	System.out.println(pessoa.getName());
	
	
	
	
	pessoa.imprima();
	System.out.println("########################");
	pessoa.mediaDeSalarial();	

	}
}
