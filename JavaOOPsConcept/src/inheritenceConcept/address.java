package inheritenceConcept;

import java.util.Scanner;

public class address {
private String city;
private String state;
Scanner sc = new Scanner(System.in);

public void readaddress() {
	System.out.println("Enter the city");
	this.city = sc.next();
	System.out.println("Enter the state");
	this.state= sc.next();
}

public void disaddress() {
	System.out.println("City is "+this.city);
	System.out.println("State is "+this.state);
}
}