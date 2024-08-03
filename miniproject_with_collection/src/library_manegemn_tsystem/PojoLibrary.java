package library_manegemn_tsystem;

//Create Book POJO with field id,name,price,authord,publication etc)
public class PojoLibrary implements Comparable
{
	int id;
	String name;
	int price;
	String authord;
	String publication;

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

	public String getAuthord() {
		return authord;
	}

	public void setAuthord(String authord) {
		this.authord = authord;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}
	// override compaer to name of nethode
	

//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		PojoLibrary ref_pojo=(PojoLibrary)o;
//		int ret=this.name.compareTo(ref_pojo.name);
//		if(ret > 0)
//		{
//			return 1;
//		}else if(ret<0)
//		{
//			return -1;
//		}else
//		{
//			return 1;
//		}
//		
//	}
	
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		PojoLibrary ref_pojo=(PojoLibrary)o;
		
		if(this.price > ref_pojo.price)
		{
			return 1;
		}else if(this.price < ref_pojo.price)
		{
			return -1;
		}else   
		{
			return 0;
		}
		
	}
	

	
	
	
}
