package GlownaPaczka;


public class Dog {

	private int size;
	private int barkVolume;
	private String name;
	
	
	
	public Dog() {
		super();
	}

	public Dog(int size, int barkVolume, String name) {
		super();
		this.size = size;
		this.barkVolume = barkVolume;
		this.name = name;
	}

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getBarkVolume() {
		return barkVolume;
	}
	public void setBarkVolume(int barkVolume) {
		this.barkVolume = barkVolume;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
