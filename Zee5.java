class Zee5{
	public static void main(String[] args){

		String kannadaMovies[]={
		"Kantara","Ugramm","Tagaru","Kirik Party","Bell Bottom",
		"Dia","Garuda","Popcorn Monkey Tiger","Badava Rascal","French Biryani",
		"Kavaludaari","Operation Alamelamma","Godhi Banna Sadharana Mykattu",
		"Maya Bazaar","Rama Rama Re","Gantumoote","Humble Politician Nograj",
		"Kenda Sampige","Athade Srimannarayana","RangiTaranga"};
		String englishMovies[]={
		"Inception","Interstellar","The Dark Knight","Tenet","Dunkirk",
		"The Prestige","Memento","Batman Begins","Man of Steel","Joker",
		"Justice League","Aquaman","Wonder Woman","The Flash","Shazam",
		"Constantine","Watchmen","V for Vendetta","Blade Runner","Arrival"};
		String hindiMovies[]={
		"Uri","The Kashmir Files","Tanu Weds Manu","Manikarnika",
		"Mulk","Rustom","Dream Girl","Veere Di Wedding","Bareilly Ki Barfi",
		"Shubh Mangal Saavdhan","Article 370","Batla House","Parmanu",
		"OMG","Raid","Badhaai Ho","Toilet Ek Prem Katha",
		"Kesari","Gabbar Is Back","Special 26"};
		String teluguMovies[]={
		"RRR","Baahubali","Baahubali 2","Magadheera","Eega",
		"Rangasthalam","Jersey","Arjun Reddy","Pokiri","Athadu",
		"Khaleja","Leader","Temper","Sye","Vikramarkudu",
		"Chatrapathi","Janatha Garage","Dear Comrade",
		"Pushpa","Ala Vaikunthapurramuloo"};

		String tamilMovies[]={
		"Vikram","Master","Kaithi","Asuran","Soorarai Pottru",
		"Jai Bhim","96","Ratsasan","Visaranai","Super Deluxe",
		"Thani Oruvan","Vada Chennai","Sarpatta Parambarai",
		"Karnan","Pariyerum Perumal","Aruvi","Pizza",
		"Sethupathi","Mersal","Bigil"};
	
	System.out.println("Kannada movies are "+ kannadaMovies.length);
	System.out.println("The list of kannada movies available are ");
	for(String kannadaMovie:kannadaMovies){
		System.out.println(kannadaMovie);
	}
	System.out.println("English movies are "+ englishMovies.length);
	System.out.println("The list of english movies available are ");
	for(String englishMovie:englishMovies){
		System.out.println(englishMovie);
	}
	System.out.println("Hindi movies are "+ hindiMovies.length);
	System.out.println("The list of hindi movies available are ");
	for(String hindiMovie:hindiMovies){
		System.out.println(hindiMovie);
	}
	System.out.println("Telugu movies are "+ teluguMovies.length);
	System.out.println("The list of telugu movies available are ");
	for(String teluguMovie:teluguMovies){
		System.out.println(teluguMovie);
	}
	System.out.println("Tamil movies are "+ tamilMovies.length);
	System.out.println("The list of tamil movies available are ");
	for(String tamilMovie:tamilMovies){
		System.out.println(tamilMovie);
	}
	}
}
