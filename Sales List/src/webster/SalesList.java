package webster;

import java.util.ArrayList;

public class SalesList {

	private ArrayList<SalesItem> allItems;

	public SalesList() {
		allItems = new ArrayList<SalesItem>();
	}

	public void addNewItem(SalesItem salesItem) {
		allItems.add(salesItem);
	}

	public String getSalesList() {
		String str = "";
		for (int i = 0; i < allItems.size(); i++) {
			str += allItems.get(i).toString() + "/n";
		}
		return str;
	}

	public Double computeTotalAmount() {
		double totalAmount = 0;
		for (int i = 0; i < allItems.size(); i++) {
			totalAmount += allItems.get(i).getTotal();
		}
		return totalAmount;
	}
}