package com;

public class CamelCase {
	public static void main(String[] args) {
		String str = "my name is Kaizer";
		System.out.println("I/P : "+str);
		System.out.print("O/P : ");
		char[] arr = str.toCharArray();
		arr[0] = Character.toUpperCase(arr[0]);
		for(int i=0; i<str.length(); i++) {
			if(arr[i]==' ') {
				arr[i+1]=Character.toUpperCase(arr[i+1]);
			}
			System.out.print(arr[i]);
		}
	}

}
