package vivian.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cities {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		ArrayList<String> areas = new ArrayList<>();
		ArrayList<String> postCode = new ArrayList<>();
		try {
			BufferedReader in = new BufferedReader(new FileReader("data.txt"));
			String line = in.readLine();
			String lastCity = "";
			while (line != null) {
				System.out.println(line);
				String[] tokens = line.split(",");
				if (!tokens[0].equals(lastCity)) {
					lastCity = tokens[0];
					cities.add(lastCity);
				}
				areas.add(tokens[1]);
				postCode.add(tokens[2]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Piease choosde city:");
		for (int i = 0; i < cities.size(); i++) {
			System.out.println(i+"."+cities.get(i).name);
		}

	}

}
