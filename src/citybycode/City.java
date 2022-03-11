package citybycode;

public class City {
	public String getCityByCode(int value) {
		if (value == 1)
			return "DELHI";
		else if (value == 2)
			return "NOIDA";
		else if (value == 3)
			return "GUARGAON";
		else if (value == 4)
			return "BANGLORE";
		else
			return "INVALIDCODE";
	}

}
