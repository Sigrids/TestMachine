
abstract class Machine {
	private String name;
	private double price;
	private double weight;
	private String description;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double p) {
		this.price = p;
	}
	public void setWeight(double w) {
		this.weight = w;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public String getName() {return name;}
	public double getPrice() {return price;}
	public double getWeight() {return weight;}
	public String getDescription() {return description;}
	
}
