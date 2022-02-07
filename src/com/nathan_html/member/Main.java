package com.nathan_html.member;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Member john = new Member(1, "John", "Doe");
		Member emeric = new Member(1, "Emeric", "Stophe");
		Member jane = new Member(3, "Jane", "Doe");
		Member mick = new Member(4, "Mick", "Jagger");
		
		List<Member> members = new ArrayList<Member>();
		members.add(john);
		members.add(emeric);
		members.add(jane);
		members.add(mick);
		
		System.out.println(
				"l'id de john : "+john.getId()+
				" et son nom : "+john.getLastName());
		
		for (Object member : members) {
			System.out.println(member.toString());
		}
	}

}
