package Test_Git;

import java.util.Scanner;

public class Weather3Dim {

	public static void main(String[] args) {
		final int NUMBER_OF_DAYS = 3;
		final int NUMBER_OF_HOURS = 2;
		System.out.printf("\n-----Starting for DAYS:%s Hours:%s", NUMBER_OF_DAYS, NUMBER_OF_HOURS);
		double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

		Scanner input = new Scanner(System.in);
		// Read input using input redirection from a file
		for (int k = 0; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++) {
			System.out.printf("\nGimme day->");
			int day = input.nextInt();
			System.out.printf("\nGimme hour->");
			int hour = input.nextInt();
			System.out.printf("\n----Gimme temp for day:%s and hour:%s  temp->", day, hour);
			double temperature = input.nextDouble();
			System.out.printf("\n------Gimme humidity for day:%s and hour:%s  humidity->", day, hour);
			double humidity = input.nextDouble();
			System.out.printf("\n Checking day=%s hour=%s ", (day - 1), (hour - 1));
			data[day - 1][hour - 1][0] = temperature;
			data[day - 1][hour - 1][1] = humidity;
		}

		// Find the average daily temperature and humidity
		for (int i = 0; i < NUMBER_OF_DAYS; i++) {
			double dailyTemperatureTotal = 0, dailyHumidityTotal = 0;
			for (int j = 0; j < NUMBER_OF_HOURS; j++) {
				dailyTemperatureTotal += data[i][j][0];
				dailyHumidityTotal += data[i][j][1];
			}

			// Display result
			System.out.println("Day " + i + "'s average temperature is " + dailyTemperatureTotal / NUMBER_OF_HOURS);
			System.out.println("Day " + i + "'s average humidity is " + dailyHumidityTotal / NUMBER_OF_HOURS);
		}
	}
}