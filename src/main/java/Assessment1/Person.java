package Assessment1;

import java.util.UUID;

public class Person {

	
	private String name;
	private final UUID id;
	
	public Person(String name) {
		super();
		this.name = name;
		id = UUID.randomUUID();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UUID getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
	
}
