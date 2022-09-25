package classesWithAttributes;

public class Product {
	
	public Product(int ıd, String name, String description, int price, int stockAmount, String renk) {
		System.out.println("yapıcı blok çalıştı");
		this.ıd=ıd;
		this.renk=renk;
		this.name=name;
		this.kod=kod;
		this.description=description;
		this.stockAmount=stockAmount;
	}
	
	public Product() {
		
	}
	//attribute,
int ıd;
 String name;
 String description;
 int price;
 int stockAmount;
 String renk;
 String kod;

//Getter
public int getId() {
	return ıd;
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getStockAmount() {
	return stockAmount;
}

public void setStockAmount(int stockAmount) {
	this.stockAmount = stockAmount;
}

public String getRenk() {
	return renk;
}

public void setRenk(String renk) {
	this.renk = renk;
}

public String getKod() {
	return this.name.substring(0,1)+ıd;
}

}
