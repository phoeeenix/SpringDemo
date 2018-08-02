package GlownaPaczka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Serwis {

	List<Dog> dogList = new ArrayList<>(Arrays.asList(
			new Dog(1, 1, "Small"),
			new Dog(2, 2, "Medium")
			));
	
	public List<Dog> getListDog() {
		return dogList;
	}
	
	public Dog getDog(String name) {
		return dogList.stream().filter(d -> d.getName().equals(name)).findFirst().get();
	}

	public void addDog(Dog dog) {
		dogList.add(dog);
		
	}

	public void updateDog(String name, Dog dog) {
		for (int i = 0; i < dogList.size(); i++) {
			Dog d = dogList.get(i);
			if (d.getName().equals(name)) {
				dogList.set(i, dog);
			}
		}
	}

	public void deleteDog(String name) {
		dogList.removeIf(d -> d.getName().equals(name));
	}
}
