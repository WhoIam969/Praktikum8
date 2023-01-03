package Praktikum8;

public class OrderDetail {
    int quantity = 1;
	String taxStatus = "5% Tax";

	
	public void calcSubTotal() {
		System.out.println("Kalkulasi sub-total");
	}
	public void calcTotalWeight() {
		System.out.println("Kalkulasi total berat");
	}
	public void calcTax() {
		System.out.println("Kalkulasi pajak");
	}
}
