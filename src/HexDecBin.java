import java.util.Scanner;

import javax.swing.JOptionPane;

public class HexDecBin {

	Scanner kbd = new Scanner(System.in);
	String name = "";
	int Option ;
	String hex = "";
	String dec = "";
	String End = "";
	Boolean GameStatus = true;
	int num;
	
	public HexDecBin() {
		System.out.println("Welcome to my Hexadecimal, decimal, or binary conversion prog");
		System.out.println("What is your name?");
		name = kbd.nextLine();
		System.out.println("Very nice to meet you " + name);
		System.out.println("What Converter would you like to start with 1-hex 2-dec 3-bin");
		Option = kbd.nextInt();
		if (Option == 1) {
			setDecNumber();
		}else if (Option == 2) {
			setHexNumber();
		}else if (Option == 3) {
			convert();
		}else {
			System.out.println("Something has gone terribly wrong");
		}
		
	}
	void setHexNumber() {
		System.out.println("Enter the hex number");
		hex = kbd.nextLine();
		num = Integer.parseInt(hex, 16);
		System.out.println("you have entered hex " + hex);
		System.out.println("Decimal value is: " + num + "(remember 0-" + num + (num+1) + " values)");
	}
	public void setDecNumber() {
		System.out.println("Input a decimal");
		dec = kbd.nextLine();
		num  = Integer.parseInt(dec);
		String hex = Integer.toHexString(num);
		System.out.println("Hex value is " + hex);
	}
	public void convert() {
		System.out.println("Input a number to convert");
		num = kbd.nextInt();
		
		String binary = Integer.toBinaryString(num);
		
		System.out.println("Binary value is: " + binary);
		System.out.println("Number of bits is " + binary.length());
		System.out.println("Number of whole nibbles (4 bits) is x with y bits left over");
		ending();
		}
	void ending() {
		System.out.println("Do you want to continue? 1-Convert 2-End");
		//Change this to be a yes no question and to pop you out at the main menu to choose another converter
		Option = kbd.nextInt();
		if (Option == 1) {
			HexDecBin baseConverter = new HexDecBin();
		if (Option == 2) {
			//end code
		}
		}
	}
		
	}

