import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("   REAL-TIME WEATHER APPLICATION");
        System.out.println("=================================");

        System.out.print("Enter city name: ");
        String city = scanner.nextLine();

        WeatherService weatherService = new WeatherService();

        String weatherData = weatherService.getWeatherData(city);

        if (weatherData != null) {
            System.out.println("\nWeather information for " + city + ":");
            System.out.println(weatherData);
        } else {
            System.out.println("\nUnable to retrieve weather for " + city);
        }

        scanner.close();
    }
}