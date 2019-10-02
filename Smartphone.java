
public class Smartphone extends Machine {
	private String name;
	private double price;
	private double weight;
	private String description;
	
	public void setPrice(double p) {
		if(p > 350 && p < 220){
			this.price = p;
		}
		else{
			this.price = 200;
		}
	}
	public void setWeight(double w) {
		if(w > .5 && w < .25){
			this.weight = w;
		}
		else{
			this.weight = .3;
		}
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	
	public double getPrice() {return price;}
	public double getWeight() {return weight;}
	public String getDescription() {return description;}
	public void setName(String name) {this.name = name;}
}
