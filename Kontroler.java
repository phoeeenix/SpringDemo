package GlownaPaczka;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Kontroler {

	@Autowired
	private Serwis serwis;
	
	@RequestMapping("/index")
	public List<Dog> Welcome(){
		return serwis.getListDog();
	}
	
	@RequestMapping("/index/{name}")
		public Dog chooseDog(@PathVariable String name){
			return serwis.getDog(name);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/index")
	public void addaDog(@RequestBody Dog dog) {
		serwis.addDog(dog);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/index/{name}")
	public void updateDog(@RequestBody Dog dog, @PathVariable String name) {
		serwis.updateDog(name, dog);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/index/{name}")
	public void deleteDog(@PathVariable String name) {
		serwis.deleteDog(name);
	}
	
}
