import java.util.Scanner;

public class HexDecBin {
//
	Scanner kbd = new Scanner(System.in);
	String name = "";
	String Option = "";
	String hex = "";
	String End = "";
	Boolean GameStatus = true;
	int num;
	
	public HexDecBin() {
		System.out.println("Welcome to my Hexadecimal, decimal, or binary conversion prog");
		System.out.println("What is your name?");
		name = kbd.nextLine();
		System.out.println("Very nice to meet you " + name);
	}
	public void setHexNumber() {
		System.out.println("\nEnter the hex number");
		hex = kbd.nextLine();
		num = Integer.parseInt(hex, 16);
		System.out.println("you have entered hex " + hex);
		System.out.println("Decimal value is: " + num + "(remember 0-" + num + (num+1) + " values)");
	}
	void convert() {
		String binary = Integer.toBinaryString(num);
		
		System.out.println("Binary value is: " + binary);
		System.out.println("Number of bits is " + binary.length());
		System.out.println("Number of whole nibbles (4 bits) is x with y bits left over");
		}

	}

