/**
 * The GoodDay class represents the factors that determine if today is a good day.
 * It stores the temperature, humidity, homework status, and dinner plans.
 * Based on these factors, it provides methods to determine if the day is good or not.
 * The class includes a nested if, compound if, and switch statements to calculate these outcomes.
 */
public class GoodDay {

    // Properties (fields)
    private int temperature;
    private double humidity;
    private boolean isHomeworkDone;
    private String dinnerMeal;

    // Default constructor (initializes fields to default values)
    public GoodDay() {
        this.temperature = 0;
        this.humidity = 0.0;
        this.isHomeworkDone = false;
        this.dinnerMeal = " ";
    }

    // Parameterized constructor (initializes fields with provided values)
    public GoodDay(int temperature, double humidity, boolean isHomeworkDone, String dinnerMeal) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.isHomeworkDone = isHomeworkDone;
        this.dinnerMeal = dinnerMeal;
    }

    // Getter and Setter methods for each property

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public boolean isHomeworkDone() {
        return isHomeworkDone;
    }

    public void setHomeworkDone(boolean isHomeworkDone) {
        this.isHomeworkDone = isHomeworkDone;
    }

    public String getDinnerMeal() {
        return dinnerMeal;
    }

    public void setDinnerMeal(String dinnerMeal) {
        // If user types "unknown", we handle it separately.
        if ("unknown".equalsIgnoreCase(dinnerMeal)) {
            this.dinnerMeal = "There are no dinner plans."; // Special message
        } else {
            this.dinnerMeal = dinnerMeal; // Accept the input as dinner plan
        }
    }

    /**
     * Determines if today is a good day based on the weather, homework completion, and dinner plans.
     * @return true if today is good, false otherwise.
     */
    public boolean isTodayGood() {
        if (isWeatherGood() && isHomeworkDone && !dinnerMeal.equals("unknown")) {
            return true;
        }
        return false;
    }

    /**
     * Determines if the weather is good based on temperature and humidity.
     * @return true if the weather is good, false otherwise.
     */
    public boolean isWeatherGood() {
        if (temperature > 70 && temperature < 85) {
            if (humidity < 60.0) {
                return true; // Good weather: warm and not too humid
            }
        }
        return false; // Bad weather: either too cold, too hot, or too humid
    }

    /**
     * Returns a string description of the day based on the current properties.
     * Uses a switch statement to describe the dinner meal.
     * @return A string describing the day.
     */
    @Override
    public String toString() {
        String weatherDescription;
        if (isWeatherGood()) {
            weatherDescription = "The weather is great today!";
        } else {
            weatherDescription = "The weather could be better.";
        }

        String homeworkStatus = isHomeworkDone ? "Your homework is done!" : "You still have homework to do.";
        String dinnerDescription;

        // Using switch for dinner meal description
        switch (dinnerMeal.toLowerCase()) {
            case "unknown":
                dinnerDescription = "Dinner plans are still unknown.";
                break;
            default:
                dinnerDescription = "You will have " + dinnerMeal +" for dinner.";
                break;
        }

        // Compound if: Determine overall day based on multiple factors
        if (isTodayGood()) {
            return weatherDescription + " " + homeworkStatus + " " + dinnerDescription + " It's a good day!";
        } else {
            return weatherDescription + " " + homeworkStatus + " " + dinnerDescription + " It's not the best day.";
        }
    }
}


