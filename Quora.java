class Quora {
	public static void main(String[] args) {
		createAcc("abc@quora.com",114,"Manoj","Bose","14-2-1987","manoj_qr",23568,"qr987","qr987");
	}
	static void createAcc(String emailId,int id,String firstName,String lastName,
	String dob,String userName,int zipCode,String password,String repeatPassword) {
		System.out.println("The emailId is: "+emailId);
		System.out.println("The id is: "+id);
		System.out.println("The firstName is: "+firstName);
		System.out.println("The lastName is: "+lastName);
		System.out.println("The dob is: "+dob);
		System.out.println("The userName is: "+userName);
		System.out.println("The zipCode is: "+zipCode);
		System.out.println("The password is: "+password);
		System.out.println("The repeatPassword is: "+repeatPassword);
	}
}
