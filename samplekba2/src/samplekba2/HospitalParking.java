
package samplekba2;

public class HospitalParking implements ParkingSystem {
	private int time;
	private double surcharge = 0.2;

	HospitalParking(int time) {
		this.time = time;
	}

	@Override
	public double processTicket() {
		// TODO Auto-generated method stub
		double price;
		if (this.time > 5 && this.time < 17) {
			price = HospitalParking.Morning * (1 + this.surcharge);
		}else if (this.time >=17 && this.time <= 24 ) {
			price = HospitalParking.Nightly * (1 + this.surcharge);
		}else {
			price = HospitalParking.Twenty_four * (1 + this.surcharge);
		}
		return price;
	}

	@Override
	public String toString() {
		return String.format("Price for the Hospital Parking is $%.2f. ", this.processTicket());

	}

}
