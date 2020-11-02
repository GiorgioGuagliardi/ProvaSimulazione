package it.unical.ingsw2020.ProvaLab;

public class MyString {

	public String invertiStringa(String s) {
		String inversa = "";
		for(int i = s.length()-1; i >= 0; i--)
			inversa+=s.charAt(i);
		return inversa;
	}
	
	public boolean isPalindroma(String s) {
		int index = s.length()-1;
		for(int i = 0; i < s.length()/2; i++)
			if(s.charAt(i) != s.charAt(index))
				return false;
			else
				index--;
		return true;
	}
}
