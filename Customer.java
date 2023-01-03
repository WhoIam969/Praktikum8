package Praktikum8;

public class Customer {
    String name;
    String address;
    public Order order;
	public Item item;


	public void tambahItem(Item e) {
		this.item = e;
	}

	public void calcSubTotal() {
		order.calcSubTotal();
	}
	public void calcTax() {
		order.calcTax();
	}
	public void calcTotal() {
		order.calcTotal();
	}
	public void calcTotalWeight() {
		order.calcTotalWeight();
	}
}