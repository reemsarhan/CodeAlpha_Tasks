package Task3;
import java.util.Scanner;
public class TravelItineraryPlanner {

    private static String getMapUrl(String destination) {
        return "https://maps.example.com/?destination=" + destination;
    }

    private static String getWeatherInfo(String destination, String date) {
        return "Weather information for " + destination + " on " + date + ": Sunny, 25°C";
    }

    private static double calculateRemainingBudget(double initialBudget, int numDestinations) {
        return initialBudget - (numDestinations * 100); // Assuming each destination costs $100
    }

    public void TravelItineraryPlanner(){
            Scanner scanner = new Scanner(System.in);


            System.out.println("Welcome to the Travel Itinerary Planner!");
            System.out.print("Enter the number of destinations: ");
            int numDestinations = scanner.nextInt();
            scanner.nextLine();

            String[] destinations = new String[numDestinations];
            String[] dates = new String[numDestinations];

            for (int i = 0; i < numDestinations; i++) {
                System.out.print("Enter destination #" + (i + 1) + ": ");
                destinations[i] = scanner.nextLine();
                System.out.print("Enter date for destination #" + (i + 1) + ": ");
                dates[i] = scanner.nextLine();
            }

            // Input preferences
            System.out.print("Enter your budget: ");
            double budget = scanner.nextDouble();
            scanner.nextLine();

            // Generate travel plan
            System.out.println("\nGenerating Travel Plan...\n");

            for (int i = 0; i < numDestinations; i++) {
                System.out.println("Destination: " + destinations[i]);
                System.out.println("Date: " + dates[i]);

                // Integrate with external APIs for maps and weather information
                String mapUrl = getMapUrl(destinations[i]);
                String weatherInfo = getWeatherInfo(destinations[i], dates[i]);

                System.out.println("Map: " + mapUrl);
                System.out.println("Weather: " + weatherInfo);
                System.out.println("-------------------------");
            }

            // Perform budget calculations
            double remainingBudget = calculateRemainingBudget(budget, numDestinations);

            System.out.println("\nBudget Summary:");
            System.out.println("Initial Budget: $" + budget);
            System.out.println("Remaining Budget: $" + remainingBudget);

            scanner.close();
        }




}

