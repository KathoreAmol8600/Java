package classandobject;
import java.util.*;
//Write a program to create class name as Product with field id, name, price and 
//create pojo with array of object size 5.
//case 1: arrange all products in descending order by price.
//case 2: Search product by Id.
class Product
{
	private int id;
	private String name;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
public class ExzampalPojoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    Product obj[] = new Product[5];
//		System.out.println("Enter the id , name, prise");
		  int id=0;
	      String name;
	      int price=0;
		
		for(int i=0;i<5;i++)
		{
			obj[i]=new Product();
			obj[i].setId(i);
			System.out.println("name, prise");
			obj[i].setName(sc.nextLine());
			obj[i].
			obj[i].setPrice(sc.nextInt());
			
		}
		
	}

}
