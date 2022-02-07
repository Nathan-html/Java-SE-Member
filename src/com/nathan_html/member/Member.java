package com.nathan_html.member;

public class Member {
	
	private int id;
	private String firstName;
	private String lastName;
	
	public Member(int id, String firstName, String lastName) {
		
		this.id = id;
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	public String toString() {
		return "Member{"
		+"id="+this.getId()
		+ ", firstName="+this.getFirstName()
		+ ", lastName="+this.getLastName()+""
		+ "}";
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getId() {
		return id;
	}
	
}
