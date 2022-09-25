package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
//		Product product = new Product(1,"Laptop,","Asus Laptop",3000,2,"siyah");
		Product product=new Product();
		product.name = "Laptop";
		System.out.println(product.name);
		product.ıd=1;
		product.description = "Asus Laptop";
		product.price = 5000;
		product.stockAmount = 3;
		product.renk="Kırmızı";
System.out.println(product.getKod());
		ProductManager productManager = new ProductManager();

		productManager.Add(product);

		product.getId();
	}

}
