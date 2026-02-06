class TwitterUserRegistration {
	static String email = "user@twitter.com";
	static int serverZone = 2;

	public static void main(String[] args) {
		String handle = "@tweetuser";
		String password = "Tw@98765";
		String authMethod = "Username";
		String token = "twtoken123";
		String userId = "tw_user_007";

		System.out.println("Server Zone: " + serverZone);
		System.out.println("Handle: " + handle);
		System.out.println("Password: " + password);
		System.out.println("Auth Method: " + authMethod);
		System.out.println("Token: " + token);
		System.out.println("User ID: " + userId);
	}
}
