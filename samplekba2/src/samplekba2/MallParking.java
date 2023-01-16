package samplekba2;

public class MallParking implements ParkingSystem {
	private int time;
	private double surcharge = 0.1;

	MallParking(int time) {
		this.time = time;
	}

	@Override
	public double processTicket() {
		// TODO Auto-generated method stub
		double price;
		if (this.time > 5 && this.time < 17) {
			price = MallParking.Morning * (1 + this.surcharge);
		} else if (this.time >= 17 && this.time <= 24) {
			price = MallParking.Nightly * (1 + this.surcharge);
		} else {
			price = MallParking.Twenty_four * (1 + this.surcharge);
		}
		return price;
	}

	@Override
	public String toString() {
		return String.format("Price for the Mall Parking is $%.2f. ", this.processTicket());

	}

}
