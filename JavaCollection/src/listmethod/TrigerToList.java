package listmethod;
import java.util.*;
public class TrigerToList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		System.out.println("Array List Create Secsessfulley");
		Add Add = new Add();
		System.out.println("Inserting the Data into the List ");
		Add.addElemntInList(list);
		
		DispleyList  DispleyList = new DispleyList();
		System.out.println("Oll Elemnt of the List");
		DispleyList.displeyList(list);
		
////		fatch elemnt from list by index -> get(i);
//		GetElemntIndex GetElemntIndex = new GetElemntIndex();
//		
//		GetElemntIndex.getElemntByIndex(list,sc);
//		
//		SetOrUpdate SetOrUpdate = new SetOrUpdate();
//		SetOrUpdate.updateValu(list);
//		System.out.println("After the update List is like");
//		DispleyList.displeyList(list);
//		
//		RemoveElemnt RemoveElemnt = new RemoveElemnt();
//		RemoveElemnt.RemoveingElemntAtIndex(list);
//		System.out.println("After the remove List is like");
//		DispleyList.displeyList(list);
//		
		IndexOfPerticulerElemnt IndexOfPerticulerElemnt = new IndexOfPerticulerElemnt();
		int retuern=IndexOfPerticulerElemnt.IndexOfPerticulerElemnt(list);
		System.out.println("this is the elemnt at the index of->"+retuern);
		
		
		
		
	
	}

}
