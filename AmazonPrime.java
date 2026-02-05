class AmazonPrime{
	public static void main(String[] args){

		String kannadaMovies[]={
		"Kirik Party","Ugramm","Tagaru","Bell Bottom","RangiTaranga","Dia","Garuda",
		"Avane Srimannarayana","Badava Rascal","Popcorn Monkey Tiger","Kavaludaari",
		"Operation Alamelamma","Humble Politician Nograj","Godhi Banna Sadharana Mykattu",
		"Maya Bazaar","French Biryani","Gantumoote","Rama Rama Re","Kenda Sampige","Athade Srimannarayana"};
		String englishMovies[]={
		"Mission Impossible","Top Gun","Jack Reacher","The Tomorrow War","The Terminal",
		"A Quiet Place","Edge of Tomorrow","Knives Out","The Bourne Identity","Skyfall",
		"Casino Royale","The Equalizer","The Martian","Gravity","World War Z",
		"Tenet","Mad Max Fury Road","The Departed","Heat","John Wick"};
		String hindiMovies[]={
		"Shershaah","Jai Bhim Hindi","Sardar Udham","Tanhaji","Kesari",
		"Article 15","Badhaai Ho","Newton","Pink","Raazi","Hindi Medium",
		"Pad Man","Stree","Sonchiriya","Piku","Batla House","Ludo",
		"Drishyam Hindi","OMG","Kahaani"};
		String teluguMovies[]={
		"Jersey","Rangasthalam","Pushpa","Ala Vaikunthapurramuloo","Magadheera",
		"Pokiri","Athadu","Sye","Leader","Bichagadu","Temper","Eega",
		"Khaleja","Vikramarkudu","Chatrapathi","Janatha Garage","Dear Comrade",
		"Baahubali","Baahubali 2","RRR"};
		String tamilMovies[]={
		"Soorarai Pottru","Jai Bhim","Vada Chennai","Kaithi","Asuran",
		"Ratsasan","Super Deluxe","Thani Oruvan","96","Visaranai",
		"Petta","Master","Vikram","Sarpatta Parambarai","Karnan",
		"Pariyerum Perumal","Aruvi","Pizza","Sethupathi","Mersal"};
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
