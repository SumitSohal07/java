import java.util.Scanner;
public class Ques1 {

	public static void main(String[] args)
	
	{
		Scanner Sumit = new Scanner(System.in);
		
		String Name;
		int age;
		Double annualPay;
		
		System.out.println("Enter Name,Age and salary here:");
		
		//fill details and press enter every time
		
		//string input
		 Name = Sumit.nextLine();
		
		//Numerical input
		 age = Sumit.nextInt();
		 annualPay = Sumit.nextDouble();
		
		//Output input by user
		
		System.out.println("My name is "+ Name + " ,my age is " +age+ " and I hope to earn $"+annualPay+" per year");
		
		
		Sumit.close();
	}

}
