package Basics;

import java.util.HashMap;
import java.util.Map.Entry;

public class Sandbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123 asdf qwer zxcv";
		char[] charArray = s.toCharArray();
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		
		if (map.containsKey("key1")) 
			System.out.println(map.get("key1"));
		
		for (Entry<String, String> en : map.entrySet()) {
			if (en.getValue() == "value2")
				System.out.println(en.getKey());
		}
		
		for(char c:charArray) {
			System.out.print(c + ", ");
		}
		System.out.println();
		
		
		Pet pet1 = new Cat("maomao", 2);
		Pet pet2 = new Dog("dogdog", 3);
		
		PetOwner joe = new PetOwner();
		joe.showOffPet(pet1);
		joe.showOffPet(pet2);
		
	}

}

class PetOwner {
	public void showOffPet(Pet pet) {
		System.out.println(pet.name + " is " + pet.age + " years old, say hi " + pet.name + ". " + pet.makeSound());
	}
}

abstract class Pet {
	protected String name;
	protected int age;
	
	public abstract String makeSound();
}

class Dog extends Pet {
	
	public Dog (String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String makeSound() {
		return "WoofWoof!!";
	}
}

class Cat extends Pet {
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String makeSound() {
		return "Meow~";
	}
}
