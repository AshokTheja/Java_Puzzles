package com.v_om_Demo;

import java.util.Scanner;

public class ReverseaStringLetters {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {

		String original;
		String reversed = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string to reverse: ");
		original = in.nextLine();

		for (int i = original.length() - 1; i >= 0; i--) {
			reversed = reversed + original.charAt(i);
		}

		System.out.println(reversed);

	}
}
