//
//Assignment 
//LibraryManagment system using Collection Framework
//
//Case 1: Add New Book (Create Book POJO with field id,name,price,authord,publication etc)
//Case 2: View all Book in last in first out format.
//Case 3: Show authorwise book 
//Case 4: Search book by author,by price,by book name or by book publication 
//Case 5: delete book by bookid or name or by publiciation 
//Case 6: Arrange all books price wise in descending order.

package library_manegemn_tsystem;

import java.util.*;

public class TriggerToLibrary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		Iterator lib = list.iterator();
		PojoLibrary arrlab[] = new PojoLibrary[100];
		labraryFunction lab_obj = new labraryFunction();
		System.out.println(
				"..........................**********Welcome in AKsoft librery world**********..........................\n\n");

		int l_con = 1;
		int show = 0;
		int total_book = -1;

		do {
			if (show == 0) {
				System.out.println("Enter the Cae");
				show = 1;
			}
			System.out.println("Enter 1: Add New Book (doont enter space bitween two string use jdjd_dnbd)");
			System.out.println("Enter 2: View all Book in last in first out format.");
			System.out.println("Enter 3: Show authorwise book ");
			System.out.println("Enter 4: Search book by author,by price,by book name or by book publication ");
			System.out.println("Enter 5: delete book by bookid or name or by publiciation ");
			System.out.println("Enter 6: Arrange all books price wise in descending order.");
			System.out.println("Enter 0: Exsit from main.");

			System.out.println("Enter hear->");
			int u_enter = sc.nextInt();

			switch (u_enter) {

			case 1:
				System.out.println("case->1");
				total_book = total_book + 1;
				if ((total_book >= 0) && (total_book <= 4)) {
					lab_obj.addNewBook(total_book, arrlab, list);
//					 total_book=total_book+1;
				} else {
					System.out.println("soory space not avelabal");
				}
				break;

			case 2:
				System.out.println("case->2");
				if (total_book >= 0) {
					lab_obj.showListOfBook(list);
				} else {
					System.out.println("ther is no any book");
				}
				break;

			case 3:
				System.out.println("case->3");
				if (total_book >= 0) {
					System.out.println("Enter the auther name");
					String author = sc.next();
					lab_obj.searchByAuthord(author, arrlab, list);
				} else {
					System.out.println("ther is no any book add somthing the search");
				}
				break;

			case 4:
				if (total_book >= 0) {
					System.out.println("case->4");
					u_enter = 0;

					do {
						System.out.println("Enter 1: Search by Author");
						System.out.println("Enter 2: Search by price");
						System.out.println("Enter 3: Search by name");
						System.out.println("Enter 4: Search by publication");
						System.out.println("Enter 0: Exsit from Search");

						System.out.println("Enter hear->");
						u_enter = sc.nextInt();

						switch (u_enter) {
						case 1:
							System.out.println("search case->1");
							if (total_book >= 0) {
								System.out.println("Enter the auther name");
								String author = sc.next();
								lab_obj.searchByAuthord(author, arrlab, list);
							} else {
								System.out.println("ther is no any book add somthing the search");
							}
							break;

						case 2:
							System.out.println("search case->2");
							if (total_book >= 0) {
								System.out.println("Enter the price ");
								int Price = sc.nextInt();
								lab_obj.searchByPrice(Price, arrlab, list);
							} else {
								System.out.println("ther is no any book add somthing the search");
							}
							break;

						case 3:
							System.out.println("search case->3");
							if (total_book >= 0) {
								System.out.println("Enter the name_of book ");
								String name = sc.next();
								lab_obj.searchByName(name, arrlab, list);
							} else {
								System.out.println("ther is no any book add somthing the search");
							}
							break;

						case 4:
							System.out.println("search case->4");
							if (total_book >= 0) {
								System.out.println("Enter the publication_name of book ");
								String publication = sc.next();
								lab_obj.searchByPublication(publication, arrlab, list);
							} else {
								System.out.println("ther is no any book add somthing the search");
							}
							break;

						case 0:
							System.out.println("Hear To Exsit from search Enter -> 0");
							break;
						default:
							System.out.println("Enterd you somthing mismatch");

						}

						System.out.println("Enter 0: Exsit from Search or Enter 1: To continew search");
						System.out.println("Enter hear->");
						l_con = sc.nextInt();
						if (l_con == 0)
							System.out.println("Exsit from Search secsefulley");
					} while (l_con != 0);
				} else {
					System.out.println("ther is no any book add somthing the search");
				}

				break;

			case 5:
//					 delete book by bookid or name or by publiciation 
				if (total_book >= 0) {
					System.out.println("case->5");
					u_enter = 0;

					do {
						System.out.println("Enter 1: Delate by id");
						System.out.println("Enter 2: Delate by name");
						System.out.println("Enter 3: Delate by publiciation");
						System.out.println("Enter 0: Exsit from Delate_Operation");

						System.out.println("Enter hear->");
						u_enter = sc.nextInt();

						switch (u_enter) {
						case 1:
							System.out.println("Delete case->1");
							if ((total_book >= 0) && (total_book <= 99)) {
								System.out.println("Delete case->1");
								if (total_book <= -1) {
									System.out.println("library is Emptey");
								} else if (total_book >= 100) {
									System.out.println("no space");
								} else {
									System.out.println("Enter the id ");
									int id = sc.nextInt();
									lab_obj.deleteById(id, arrlab, list);
									total_book = total_book - 1;
									System.out.println("rimenning book list");
									if (total_book >= 0)
										lab_obj.showListOfBook(list);

								}

							}
							break;

						case 2:
							System.out.println("Delete case->2");

							if ((total_book >= 0) && (total_book <= 99)) {
								System.out.println("Delete case->1");
								if (total_book <= -1) {
									System.out.println("library is Emptey");
								} else if (total_book >= 100) {
									System.out.println("no space");
								} else {
									System.out.println("Enter the name ");
									String name = sc.next();
									lab_obj.deleteByName(name, arrlab, list);
									total_book = total_book - 1;
									System.out.println("rimenning book list");
									if (total_book >= 0)
										lab_obj.showListOfBook(list);

								}

							}

							break;

						case 3:
							System.out.println("Delete case->3");
							if ((total_book >= 0) && (total_book <= 99)) {
								System.out.println("Delete case->1");
								if (total_book <= -1) {
									System.out.println("library is Emptey");
								} else if (total_book >= 100) {
									System.out.println("no space");
								} else {
									System.out.println("Enter the Publication ");
									String Publication = sc.next();
									lab_obj.deleteByPublication(Publication, arrlab, list);
									total_book = total_book - 1;
									System.out.println("rimenning book list");
									if (total_book >= 0)
										lab_obj.showListOfBook(list);
								}

							}

							break;

						case 0:
							System.out.println("Hear To Exsit from Delate_Opration Enter -> 0");
							break;
						default:
							System.out.println("Enterd you somthing mismatch");

						}

						System.out.println("Enter 0: Exsit from Delate_Operation or Enter 1: To continew search");
						System.out.println("Enter hear->");
						l_con = sc.nextInt();
						if (l_con == 0)
							System.out.println("Exsit from Delate_Operation secsefulley");
					} while (l_con != 0);

				} else {
					System.out.println("Library is_Emptey Enter Book for Delete operation");
				}
				break;

			case 6:
				System.out.println("case->6");
				if (total_book >= 0) {
					lab_obj.sortAsendingOrder(list);
					
					System.out.println("Secsefulley sort");
					lab_obj.showListOfBook(list);
					
				} else {
					System.out.println("ther is no any book add somthing fro assecnding");
				}
				
				break;

			case 0:
				System.out.println("Hear To Exsit from main Enter -> 0");
				break;

			default:
				System.out.println("Enter somthing mismatch");

			}

			System.out.println("Enter 0: Exsit from main or Enter 1: To continew main");
			System.out.println("Enter hear->");
			l_con = sc.nextInt();
			if (l_con == 0)
				System.out.println("\n\n..........Thanks to use AK_soft librery world Application..........");
			else
				System.out.println("Enter the  Caee");

		} while (l_con != 0);
	}

	private static void swith(int l_con) {
		// TODO Auto-generated method stub

	}
}
