package egenday2;

import java.util.HashMap;

public class Countries {

	private static HashMap<String, String> country;
	private static HashMap<String, Integer> prices;
	
	public static HashMap<String, String> getCountries() {
		country = new HashMap<>();
		country.put("INDIA", "foot");
		country.put("USA", "meter");
		country.put("CHINA", "centimetre");
		country.put("GERMANY", "yard");
		country.put("FRANCE", "inches");
		return country;

	}
public static HashMap<String, Integer> getPrices(){
	prices= new HashMap<>();
	prices.put("INDIA", 10);
	prices.put("USA", 20);
	prices.put("CHINA", 30);
	prices.put("GERMANY", 40);
	prices.put("FRANCE", 50);
	return prices;

	
	
}
}
