package Programs;
import java.util.Scanner;
public class OdiaMatrimonyApp {
	
	static Scanner sc = new Scanner(System.in);  // Scanner cls put anywhere(cls/main method)
	//static variable
	static String language = "odia";
	//static initializer
	static
		{
         System.out.println("Odia matrimony ku Swagatam..");
		 System.out.println("Enter your language");
		 String lang = sc.next();
		 if (lang.equals(language))
		 {
            System.out.println("Enter your age..");
			int age = sc.nextInt();
			if (age>=25 && age<=35)
			{
				System.out.println("Enter your salary");
				double sal = sc.nextDouble();
				if (sal>=25000)
				{
					System.out.println("your are eligible to register");
				}
				else{
					System.exit(0);
				}
			}
			else
                System.exit(0);  //exit 2st if condition(age)
		 }
		 else  
			{
		     System.out.println("This app only for Odia People.."); // exit 1st if condition(language)
			 System.exit(0);  //to terminate..
			 }
		 }
		 //static method
	public static String registraion()
	{
      System.out.println("Enter your name..");
	  sc.nextLine();
	  String name = sc.nextLine();
	  String correctName="yes";
	  //validation for name
	  for (int i=0;i<name.length();i++)
	  {
		  if (!Character.isAlphabetic(name.charAt(i))) //to check the given character is alphabet
		  {
			  correctName = "No";
			  break;
		  }
	  }
	System.out.println("Enter your mbl no..");
	long mobileNumber = sc.nextLong();
	String mb = mobileNumber + " " , correctMobileNo = " ";

	//validation for mobile no..
	if (mb.length()==10)
	{
		char firstDigit = mb.charAt(0);  
		//conerting char digit into number digit
		int ch = firstDigit ='0';
		if (ch==9||ch==8||ch==7||ch==6)
           correctMobileNo = "yes";   
		else
           correctMobileNo = "No";
	}
	else{
		correctMobileNo = "No";
	}
	//validation name and mbl number..
	if (correctName.equals("yes") && correctMobileNo.equals("yes"))
	  {
		return "registration successful";
	  }
    return "registration not complited due to invalid data";
	}
	//main method..
	public static void main(String[] args) 
	{
		System.out.println("Please register the application..");
		System.out.println(registraion());
	}
}
	