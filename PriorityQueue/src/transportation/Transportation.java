package transportation;
public class Transportation {
	
	private String description;
	private int id;

	public Transportation(String description, int id) {
		this.description = description;
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}

	public int getId() {
		return id;
	}
	
	
	@Override
	public String toString() {
		return "Transportation [description=" + description + ", id=" + id + "]";
	}

}
