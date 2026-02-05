class WhatsAppUserRegistration {

	static String mobile = "+91XXXXXXXXXX";
	static int countryCode = 91;

	public static void main(String[] args) {
		String username = "whatsapp_user";
		String otp = "456789";
		String authMethod = "Mobile OTP";
		String token = "waToken11";
		String userId = "wa_101";

		System.out.println("Country Code: " + countryCode);
		System.out.println("Username: " + username);
		System.out.println("OTP: " + otp);
		System.out.println("Auth Method: " + authMethod);
		System.out.println("Token: " + token);
		System.out.println("User ID: " + userId);
	}
}
