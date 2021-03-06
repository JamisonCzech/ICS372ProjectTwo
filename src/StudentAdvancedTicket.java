import java.io.Serializable;
import java.util.Calendar;

public class StudentAdvancedTicket extends Ticket implements Serializable {

	public StudentAdvancedTicket(int quantity, double price, Calendar date) {
		this.quantity = quantity;
		this.date = date;
		this.ticketType = "Student Advanced Ticket";
		this.price = setPrice(price);
	}

	@Override
	protected double setPrice(double ticketPrice) {
		this.price = ticketPrice * .5;
		return this.price;
	}

	public String toString() {
		String outputString = "Ticket Serial Number: " + this.getSerialNumber()
				+ "Type: " + this.ticketType 
				+ "Date: " + this.date 
				+ "Price: " + this.price 
				+ "Quantity: " + this.quantity
				+ "Total: " + this.getTotal();

		return outputString;
	}
}
