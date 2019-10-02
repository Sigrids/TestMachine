
public class TestMachine {

	public static void main(String[] args) {
		int j = 1;
		String name;
		String des;
		double price;
		double weight;
		
		Machine[] mach = new Machine[10];
		mach[0]= new Printer();
		mach[1]= new Printer();
		mach[2]= new Printer();
		mach[3]= new Printer();
		mach[4]= new Scanner();
		mach[5]= new Scanner();
		mach[6]= new Scanner();
		mach[7]= new Smartphone();
		mach[8]= new Smartphone();
		mach[9]= new Smartphone();
		
		mach[0].setName("Printer A");
		mach[0].setDescription("This is a laser printer");
		mach[0].setPrice(199.0);
		mach[0].setWeight(30.0);
		
		mach[1].setName("Printer B");
		mach[1].setDescription("This is a inkjet printer");
		mach[1].setPrice(40.0);
		mach[1].setWeight(1.5);
		
		mach[2].setName("Printer C");
		mach[2].setDescription("This is a slow inkjet printer");
		mach[2].setPrice(70.0);
		mach[2].setWeight(6.0);
		
		mach[3].setName("Printer D");
		mach[3].setDescription("This is a fast inkjet printer");
		mach[3].setPrice(50.0);
		mach[3].setWeight(7.0);
		
		mach[4].setName("Scanner A");
		mach[4].setDescription("This is a black and white scanner");
		mach[4].setPrice(70.0);
		mach[4].setWeight(4.0);
		
		mach[5].setName("Scanner B");
		mach[5].setDescription("This is a color scanner");
		mach[5].setPrice(80.0);
		mach[5].setWeight(20.0);
		
		mach[6].setName("Scanner C");
		mach[6].setDescription("This scanner is both color and black/white");
		mach[6].setPrice(250.0);
		mach[6].setWeight(20.0);
		
		mach[7].setName("Smartphone A");
		mach[7].setDescription("This smartphone has Marshmallow operating system");
		mach[7].setPrice(230.0);
		mach[7].setWeight(0.4);
		
		mach[8].setName("Smartphone B");
		mach[8].setDescription("This smartphone has KitKat operating system");
		mach[8].setPrice(240.0);
		mach[8].setWeight(0.3);
		
		mach[9].setName("Smartphone C");
		mach[9].setDescription("This smartphone has Jelly Bean operating system");
		mach[9].setPrice(235.0);
		mach[9].setWeight(0.45);
		
		for (int i = 0; i<10; i++){
			
			name=mach[i].getName();
			des=mach[i].getDescription();
			price=mach[i].getPrice();
			weight=mach[i].getWeight();
			
			System.out.println("Machine : " + j);
			System.out.println("Name: " + name);
			System.out.println("Description: " + des);
			System.out.println("Price: " + price);
			System.out.println("Weight: " + weight + "\n");
			j++;
		}
		

	}

}
