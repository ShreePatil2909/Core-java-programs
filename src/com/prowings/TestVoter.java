package com.prowings;

public class TestVoter {

	public static void main(String[] args) {

		Voter v1 = new Voter(123456, "Shree", "Pune");
		Voter v2 = new Voter(456789, "Komal", "Gargoti");
		Voter v3 = new Voter(258963, "Sayali", "Kop");

		String res = (validVoter(v1)) ? "have Valid voterId" : "Is voter id not exist";
		System.out.println(v1.getName() + " " + res);

	}

	public static boolean validVoter(Voter obj) {
		if (obj.getV_id() >= 12345268) {
			return true;
		} else
			throw new InvalideVoterId("This voter id dosen't exist");
	}

}
