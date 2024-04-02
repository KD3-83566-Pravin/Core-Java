import java.util.Scanner;
//import java.util.Integer;
public class Que1 {
	//Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1;
		//Integer i = new Integer(num1);
		System.out.println("enter value");
		 num1=sc.nextInt();
		System.out.println("num1: "+num1);
		System.out.println("num1 in Binary: "+Integer.toBinaryString(num1));
		System.out.println("num1 in Octal: "+Integer.toOctalString(num1));
		System.out.println("num1 in Hexadecimal: "+Integer.toHexString(num1));
		
		
	}
}
