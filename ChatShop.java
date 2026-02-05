class ChatShop{
	public static void main(String[] args){
		String chatItems[]={"Pani Puri","Bhel Puri","Sev Puri","Masala Puri","Dahi Puri","Aloo Tikki","Samosa","Kachori","Papdi Chat","Ragda Patties"};
		//String teaItems[]={"Normal Tea","Ginger Tea","Masala Tea","Green Tea","Black Tea","Lemon Tea","Elaichi Tea","Tulsi Tea","Honey Tea","Milk Tea"};
	    String paniPuri = chatItems[0];
		String belPuri = chatItems[1];
		String sevPuri = chatItems[2];
	    String masalaPuri = chatItems[3];
		String dahiPuri = chatItems[4];
		String alooTikki = chatItems[5];
		String samosa = chatItems[6];
		String kachori = chatItems[7];
		String papdiChat = chatItems[8];
		String ragdaPatties = chatItems[9];
		
		int size = chatItems.length;
		System.out.println("The number of chats available are "+size);
	System.out.println("Chats names are");	
	System.out.println(paniPuri + " "+belPuri+" "+sevPuri+" "+masalaPuri+" "+dahiPuri+" "+samosa+" "+kachori+" "+papdiChat+" "+ragdaPatties);
	
	System.out.println("Chats lists using for each ");	
	for(String chatName: chatItems)
		System.out.println(chatName);	
	}
}
