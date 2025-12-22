class Dog {
	String name;
	String breed;
	String color;
	int age;

	void bark(String name){
	System.out.println(name + " barks!");
	}
	
	void run(String name){
	System.out.println(name + " run!");
	}

	void walk(String name){
	System.out.println(name + " walk!");
	}

	public static void main (String args[])	{
	Dog billy = new Dog();

	billy.name = "Billy";
	billy.breed = "Golden Retriever";
	billy.color = "Golden";
	billy.age = 1;
	
	System.out.println("Billy's name: "+ billy.name);
	System.out.println("Billy's breed: "+ billy.breed);
	System.out.println("Billy's color: "+ billy.color);
	System.out.println("Billy's age: "+ billy.age);
	billy.bark("Billy");
	billy.run("Billy");
	billy.walk("Billy");

	Dog ted = new Dog();
	
	ted.name = "Ted";
	ted.breed = "German Shepard";
	ted.color = "Black";
	ted.age = 3;
	
	System.out.println("Ted's name: "+ ted.name);
	System.out.println("Ted's breed: "+ ted.breed);
	System.out.println("Ted's color: "+ ted.color);
	System.out.println("Ted's age: "+ ted.age);
	ted.bark("Ted");
	ted.run("Ted");
	ted.walk("Ted");



	}

}