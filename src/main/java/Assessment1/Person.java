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
		String name = "Name: "+this.name;
		String id = "Id: "+this.id;
		return name + "\n" +id;
	}
	
	
}
