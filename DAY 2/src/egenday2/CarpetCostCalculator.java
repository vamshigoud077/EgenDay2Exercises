package egenday2;

import java.util.HashMap;
import java.util.Scanner;

public class CarpetCostCalculator {
	public static void main(String args[]) {

		HashMap<String, String> country = Countries.getCountries();
		HashMap<String, Integer> prices = Countries.getPrices();
		Scanner scan = new Scanner(System.in);

		System.out.println(" Enter the country code from below:");
		for (String countryName : country.keySet()) {
			System.out.println(countryName);
		}
		String code = scan.nextLine();
		if (country.keySet().contains(code)) {
			String countryUnit = country.get(code);

			System.out.println("Enter the length of the room in :" + countryUnit);

			int length = scan.nextInt();
			System.out.println("Enter width of the room in :" + countryUnit);

			int width = scan.nextInt();
			

			int costPerSquareFoot = prices.get(code);
			scan.close();

			RoomDimension roomDimension = new RoomDimension(length, width);

			RoomCarpet roomCarpet = new RoomCarpet(roomDimension, costPerSquareFoot);

			int totalCostofCarpet = roomCarpet.totalCostOfCarpet();
			System.out.println("Total carpet cost is :" + roomCarpet.totalCostOfCarpet());

		} else {
			System.out.println("Enter a valid country code");
		}

	}
}