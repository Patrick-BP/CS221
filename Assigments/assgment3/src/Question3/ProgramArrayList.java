package Question3;

import java.util.ArrayList;

public class ProgramArrayList {

	public static void main(String[] args) {

		ArrayList<Marketing> mList= new ArrayList<>();
		mList.add(new Marketing("john","beans",30));
		Marketing mark1 = new Marketing("Patrick","banana",40);
		Marketing mark2 = new Marketing("kelly","potatoes",20);

		System.out.println("\n======================= adding person ===================================\n");
		mList.add(mark1);
		mList.add(mark2);
		System.out.println(mList);


		System.out.println("\n======================= remove person ===================================\n");
		mList.remove(mark2);
		System.out.println(mList);

		System.out.println("\n======================= Set person ===================================\n");
		Marketing mark3 = new Marketing("Paul","tomatoes",10);
		mList.set(0,mark3);
		System.out.println(mList);

		System.out.println("\n======================= Size of the List  ===================================\n");
		System.out.println(mList.size());

		System.out.println("\n======================= total sales ===================================\n");
		double sales = mark1.getSalesAmount() + mark2.getSalesAmount() + mark3.getSalesAmount();
		System.out.println(sales);

		System.out.println("\n======================= use get method ===================================\n");
		System.out.println(mark1.getEmployeeName());


		System.out.println("\n======================= clear method ===================================\n");
		mList.clear();
		System.out.println(mList);
	}

}
