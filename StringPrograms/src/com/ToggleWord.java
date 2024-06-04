package com;

public class ToggleWord {
	public static void main(String[] args) {
		String[] str = { "SHivu", "Surendra", "SAngamesh", "Kaizer" };
		for (int i = 0; i < str.length; i++) {
			char[] str1 = str[i].toCharArray();
			if (Character.isUpperCase(str1[1])) {
				str1[1]=Character.toLowerCase(str1[1]);
			}
			else{
				str1[1]=Character.toUpperCase(str1[1]);
			}
			

			System.out.print(str1);
			
		}
	}
}
