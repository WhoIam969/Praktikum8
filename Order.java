package Praktikum8;

public class Order {
    String date;
	String status;
	public OrderDetail detail;

	public Order(OrderDetail e) {
		detail = e;
	}

	public void calcSubTotal() {
		detail.calcSubTotal();
	}
	public void calcTax() {
		detail.calcTax();
	}
	public void calcTotal() {
		System.out.println("Kalkulasi total semua");
	}
	public void calcTotalWeight() {
		detail.calcTotalWeight();
	}
}
