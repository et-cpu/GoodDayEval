public class Main {
    public static void main(String[] args) {
        // Create a GoodDay instance using the default constructor
        GoodDay defaultDay = new GoodDay();

        // Set properties using setters
        defaultDay.setTemperature(75);
        defaultDay.setHumidity(50.0);
        defaultDay.setIsHomeworkDone(true);
        defaultDay.setDinnerMeal("Pizza");

        // Display results for defaultDay
        System.out.println("Default Day: ");
        System.out.println(defaultDay.toString());
        System.out.println("Is today good? " + defaultDay.isTodayGood());
        System.out.println("Is the weather good? " + defaultDay.isWeatherGood());

        // Create a GoodDay instance using the parameterized constructor
        GoodDay parameterizedDay = new GoodDay(85, 60.0, false, "Salad");

        // Display results for parameterizedDay
        System.out.println("\nParameterized Day: ");
        System.out.println(parameterizedDay.toString());
        System.out.println("Is today good? " + parameterizedDay.isTodayGood());
        System.out.println("Is the weather good? " + parameterizedDay.isWeatherGood());
    }
}
