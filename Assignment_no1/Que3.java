import java.util.Scanner;

public class Que3 {
     static double total;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int count;
	int choics;
		do {
			System.out.println("0 : genret total bill pluse exit");
			System.out.println("1 : enter 1 for order dosa");
			System.out.println("2 : enter 2 for order Samosa");
			System.out.println("3 : enter 3 for order tea");
			System.out.println("4 : enter 4 for order Idli");
			System.out.println("enter your choics");
			choics = sc.nextInt();
			switch(choics) {
			case 0:
			System.out.println("total bill: "+total);
			choics=0;
			break;
			case 1: 
				count=1;
				System.out.println("Thank you for ordering dosa");
				System.out.println("enter number of orders ");
				count=sc.nextInt();
				total+=count*30;
				break;
			case 2:
				 count=1;
				System.out.println("Thank you for ordering samosa");
				System.out.println("enter number of orders ");
				count=sc.nextInt();
				total+=count*20;
				break;
			case 3:
				count=1;
				System.out.println("Thank you for ordering  tea");
				System.out.println("enter number of orders ");
				count=sc.nextInt();
				total+=count*10;
				break;
			case 4:
				count=1;
				System.out.println("Thank you for ordering idli");
				System.out.println("enter number of orders ");
				count=sc.nextInt();
				total+=count*20;
				break;
			default:
					System.out.println("invalied choics");
					break;	
			} 
		}while(choics!=0);					
	}
}
