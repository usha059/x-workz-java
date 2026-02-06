class FacebookUserRegistration {
	static String email = "user@facebook.com";
	static int dataCenter = 3;

	public static void main(String[] args) {
		String username = "fb_user";
		String password = "Fb@12345";
		String authMethod = "Email";
		String token = "fb98765token";
		String userId = "fb_user_001";

		System.out.println("Data Center: " + dataCenter);
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
		System.out.println("Auth Method: " + authMethod);
		System.out.println("Token: " + token);
		System.out.println("User ID: " + userId);
	}
}
