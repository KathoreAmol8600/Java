package library_manegemn_tsystem;

import java.util.*;

public class labraryFunction {
//	lab_obj.addNewBook(total_book,arrlab,list);
	Scanner sc = new Scanner(System.in);

	public void addNewBook(int total_book, PojoLibrary arrlab[], ArrayList list) {
		arrlab[total_book] = new PojoLibrary();
		System.out.print("Enter Name->");
		arrlab[total_book].setName(sc.next());
		System.out.print("Enter Authord>");
		arrlab[total_book].setAuthord(sc.next());
		System.out.print("Enter Publication->");
		arrlab[total_book].setPublication(sc.next());
		System.out.print("Enter Id->");
		arrlab[total_book].setId(sc.nextInt());
		System.out.print("Enter Price->");
		arrlab[total_book].setPrice(sc.nextInt());
		list.add(arrlab[total_book]);
//			 System.out.println();

	}

	public void showListOfBook(ArrayList list) {
 
		ListIterator li = list.listIterator(list.size());
		System.out.println("list of Book\n");
		System.out.println("id\tname\tprice\tAuthord\tPublication ");
		while (li.hasPrevious()) {
//			 System.out.println("1");
			Object obj = li.previous();
			PojoLibrary pl = (PojoLibrary) obj;
			System.out.println(pl.getId() + "\t" + pl.getName() + "\t" + pl.getPrice() + "\t" + pl.getAuthord() + "\t"
					+ pl.getPublication());
		}
	}

	public void searchByAuthord(String U_author, PojoLibrary arraylab[], ArrayList list) {
		int index = 0;
		Iterator i = list.iterator();
		boolean flag = false;
		System.out.println("id\tname\tprice\tAuthord\tPublication ");
		while (i.hasNext()) {
			Object obj = i.next();
			PojoLibrary pl = (PojoLibrary) obj;

			if (U_author.equals(pl.getAuthord())) {
				flag = true;
				index = list.indexOf(pl);
				Object obj2 = list.get(index);
				PojoLibrary pl1 = (PojoLibrary) obj2;
				System.out.println(pl1.getId() + "\t" + pl1.getName() + "\t" + pl1.getPrice() + "\t" + pl1.getAuthord()
						+ "\t" + pl1.getPublication());
			}
		}
		if (flag) {

		} else {
			System.out.println("sory. ther is no any type of this author book");

		}
	}

	public void searchByPrice(int U_price, PojoLibrary arraylab[], ArrayList list) {
		int index = 0;
		Iterator i = list.iterator();
		boolean flag = false;
		System.out.println("id\tname\tprice\tAuthord\tPublication ");
		while (i.hasNext()) {
			Object obj = i.next();
			PojoLibrary pl = (PojoLibrary) obj;
			int ret_price = pl.getPrice();
			if (U_price == ret_price) {
				flag = true;
				index = list.indexOf(pl);
				Object obj2 = list.get(index);
				PojoLibrary pl1 = (PojoLibrary) obj2;
				System.out.println(pl1.getId() + "\t" + pl1.getName() + "\t" + pl1.getPrice() + "\t" + pl1.getAuthord()
						+ "\t" + pl1.getPublication());
			}
		}
		if (flag) {
			System.out.println("true");
		} else {
			System.out.println("sory. ther is no any type of this id book");

		}
	}

	public void searchByName(String U_name, PojoLibrary arraylab[], ArrayList list) {
		int index = 0;
		Iterator i = list.iterator();
		boolean flag = false;
		System.out.println("id\tname\tprice\tAuthord\tPublication ");
		while (i.hasNext()) {
			Object obj = i.next();
			PojoLibrary pl = (PojoLibrary) obj;

			if (U_name.equals(pl.getName())) {
				flag = true;
				index = list.indexOf(pl);
				Object obj2 = list.get(index);
				PojoLibrary pl1 = (PojoLibrary) obj2;
				System.out.println(pl1.getId() + "\t" + pl1.getName() + "\t" + pl1.getPrice() + "\t" + pl1.getAuthord()
						+ "\t" + pl1.getPublication());
			}
		}
		if (flag) {

		} else {
			System.out.println("sory. ther is no any type of this name book");

		}
	}

	public void searchByPublication(String U_publication, PojoLibrary arraylab[], ArrayList list) {
		int index = 0;
		Iterator i = list.iterator();
		boolean flag = false;
		System.out.println("id\tname\tprice\tAuthord\tPublication ");
		while (i.hasNext()) {
			Object obj = i.next();
			PojoLibrary pl = (PojoLibrary) obj;

			if (U_publication.equals(pl.getPublication())) {
				flag = true;
				index = list.indexOf(pl);
				Object obj2 = list.get(index);
				PojoLibrary pl1 = (PojoLibrary) obj2;
				System.out.println(pl1.getId() + "\t" + pl1.getName() + "\t" + pl1.getPrice() + "\t" + pl1.getAuthord()
						+ "\t" + pl1.getPublication());
			}
		}
		if (flag) {

		} else {
			System.out.println("sory. ther is no any type of this Publication book");

		}
	}

	public void deleteById(int U_id, PojoLibrary arraylab[], ArrayList list) {
		int index = 0;
		Iterator i = list.iterator();
		boolean flag = false;
		System.out.println("id\tname\tprice\tAuthord\tPublication ");
		while (i.hasNext()) {
			Object obj = i.next();
			PojoLibrary pl = (PojoLibrary) obj;
			int ret_id = pl.getId();
			if (U_id == ret_id) {
				flag = true;
				index = list.indexOf(pl);
				Object obj3 = list.remove(index);
				PojoLibrary pl1 = (PojoLibrary) obj3;
				System.out.println("secsefulley Delate id->" + pl1.getId());
				break;
			}
		}
		if (flag) {
			System.out.println("true");
		} else {
			System.out.println("sory. ther is no any type of this id book");

		}
	}

	public void deleteByName(String name, PojoLibrary arraylab[], ArrayList list) {
		int index = 0;
		Iterator i = list.iterator();
		boolean flag = false;
		System.out.println("id\tname\tprice\tAuthord\tPublication ");
		while (i.hasNext()) {
			Object obj = i.next();
			PojoLibrary pl = (PojoLibrary) obj;

			if (name.equals(pl.getName())) {
				flag = true;
				index = list.indexOf(pl);
				Object obj3 = list.remove(index);
				PojoLibrary pl1 = (PojoLibrary) obj3;
				System.out.println("secsefulley Delate by name->" + pl1.getName());
				break;
			}
		}
		if (flag) {
			System.out.println("true");
		} else {
			System.out.println("sory. ther is no any type of this id book");

		}
	}

	public void deleteByPublication(String Publication, PojoLibrary arraylab[], ArrayList list) {
		int index = 0;
		Iterator i = list.iterator();
		boolean flag = false;
		System.out.println("id\tname\tprice\tAuthord\tPublication ");
		while (i.hasNext()) {
			Object obj = i.next();
			PojoLibrary pl = (PojoLibrary) obj;

			if (Publication.equals(pl.getPublication())) {
				flag = true;
				index = list.indexOf(pl);
				Object obj3 = list.remove(index);
				PojoLibrary pl1 = (PojoLibrary) obj3;
				System.out.println("secsefulley Delate by publivcation->" + pl1.getPublication());
				break;
			}
		}
		if (flag) {
			System.out.println("true");
		} else {
			System.out.println("sory. ther is no any type of this id book");

		}

	}

	public void sortAsendingOrder(ArrayList list) 
	{
		Collections.sort(list);
		
		
	}

}
