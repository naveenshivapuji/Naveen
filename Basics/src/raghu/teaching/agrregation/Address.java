package raghu.teaching.agrregation;

public class Address {

	String city;
	String state;
	String country;

	Address(String city, String state, String country) {

		this.city = city;
		this.state = state;
		this.country = country;
	}

	String getAddress() {
		return city + "," + state + "," + country;
	}

}
