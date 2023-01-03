package Praktikum8;

public class Main {
    public static void main(String[] args) {


		Order pesan = new Order(new OrderDetail());

		Customer org1 = new Customer();
		org1.name = "Dimas";
		org1.address = "Jakarta";

		org1.tambahItem(new Item(10,"Nasi Padang"));
		org1.tambahItem(new Item(5,"Mie Ayam"));

		Customer.order();



	}
}
