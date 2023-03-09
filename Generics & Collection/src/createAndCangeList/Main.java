package createAndCangeList;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		createAndChangeList();

	}
	
	public static void createAndChangeList() {
		List <String > someList = new ArrayList <>();
		for(int i = 0;i < 10;i++) {
			someList.add("item" + (i+1));
		}
		System.out.println(someList);
		someList.remove(0);
		someList.remove(0);
		someList.remove(someList.size()-1);
		
		//someList.remove("item10");
		System.out.println(someList);
	}
	

}
