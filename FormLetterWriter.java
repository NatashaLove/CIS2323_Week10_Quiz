public class FormLetterWriter{
	
	public static void main(String[] args){
		String fName= "Mary";
		String lname= "Poppins";
		System.out.println();
		displaySalutation(lname);
		displaySalutation(fName,lname);
		
		
		
	}
	
	public static void displaySalutation(String lastName) {
		
		System.out.println("Dear Mr./Mrs "+ lastName);
		System.out.println("Thank you for your recent order.");
		System.out.println("_________________________________");
	}
	
	public static void displaySalutation(String firstName, String lastName) {
		
		System.out.println("Dear Mr./Mrs "+ firstName + " " + lastName);
		System.out.println("Thank you for your recent order.");
		System.out.println("_________________________________");
	}
}