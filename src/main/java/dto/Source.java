package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Source {
	@JsonProperty("account_number")
	private int accountNumber;
	
	@JsonProperty("balance")
	private double balance;
	
	@JsonProperty("firstname")
	private String firstName;
	
	@JsonProperty("lastname")
	private String lastName;
	
	private int age;
	
	private String gender;
	
	private String address;
	
	private String employer;
	
	private String email;
	
	private String city;
	
	private String state;

	@Override
	public String toString() {
		return "Source [accountNumber=" + accountNumber + ", balance="
				+ balance + ", firstName=" + firstName + ", lastName="
				+ lastName + ", age=" + age + ", gender=" + gender
				+ ", address=" + address + ", employer=" + employer
				+ ", email=" + email + ", city=" + city + ", state=" + state
				+ "]";
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
