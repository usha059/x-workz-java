class YouTube {
	public static void main(String[] args) {
		createAcc("abc@youtube.com",107,"Priya","Verma","7-7-1994","priya_yt",23561,"yt987","yt987");
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
