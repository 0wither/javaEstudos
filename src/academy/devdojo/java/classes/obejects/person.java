package academy.devdojo.java.classes.obejects;

public class person {
	
	private String name;
	private int age;
	
	
	public double[] salarios;
	
	
	
	
	//set = seta o nome, altera a variavel dentro do  objeto
	public void setname(String inputName) {
		this.name = inputName;
}
			
	//pega o nome 
	public String getName() {
		return this.name;
}
	
			
			
	
	public void setAge(int Age) {
		if (Age != 0) { 
			age = Age;
			return;
		}
		System.out.println("error");
	}
	//pega o nome 
	public int getAge() {
		return this.age;
	}
	
	
	
	
	
	public void imprima() {
//               NOT USE
//		System.out.println(getName());
//		System.out.println(getAge());

		System.out.println(this.name);
		System.out.println(this.age);
		
		
		
		for (int i = 0; i < salarios.length; i++) {
			System.out.print("salario " + i + ": ");
			System.out.println(this.salarios[i]);
		}
	}
	public void mediaDeSalarial() {
		if (salarios == null) {
			return;
		}
		
		double media = 0;
		
		for (double salario: salarios) {
			media += salario;
			
		}
		System.out.println("total: " + media);
		media = media/=salarios.length;
		
		System.out.println("media: " + media);
	}
}
