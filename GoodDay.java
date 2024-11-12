/**
 * GoodDay class stores information about daily factors
 * to determine if today is a good day.
 */
public class GoodDay {

    private int temperature;
    private double humidity;
    private boolean isHomeworkDone;
    private String dinnerMeal;

    // Default Constructor
    public GoodDay() {
        temperature = 0;
        humidity = 0.0;
        isHomeworkDone = false;
        dinnerMeal = "";
    }

    // Parameterized Constructor
    public GoodDay(int temperature, double humidity, boolean isHomeworkDone, String dinnerMeal) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.isHomeworkDone = isHomeworkDone;
        this.dinnerMeal = dinnerMeal;
    }

    // Getters and Setters
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

    public boolean getIsHomeworkDone() {
        return isHomeworkDone;
    }

    public void setIsHomeworkDone(boolean isHomeworkDone) {
        this.isHomeworkDone = isHomeworkDone;
    }

    public String getDinnerMeal() {
        return dinnerMeal;
    }

    public void setDinnerMeal(String dinnerMeal) {
        this.dinnerMeal = dinnerMeal;
    }

    // Determines if the weather is good
    public boolean isWeatherGood() {
        return (temperature >= 60 && temperature <= 80) && (humidity <= 70.0);
    }

    // Determines if today is good based on all factors
    public boolean isTodayGood() {
        // Nested if
        if (isWeatherGood()) {
            if (isHomeworkDone) {
                switch (dinnerMeal.toLowerCase()) {
                    case "pizza":
                    case "sushi":
                    case "steak":
                        return true;
                    default:
                        return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // Returns a string description based on factors
    @Override
    public String toString() {
        if (isTodayGood()) {
            return "Today is a great day! The weather is nice, homework is done, and dinner is delicious.";
        } else if (!isWeatherGood()) {
            return "Today isn't great due to bad weather.";
        } else if (!isHomeworkDone) {
            return "Today could be better if homework was done.";
        } else {
            return "Today is average. Make the most of it!";
        }
    }
}
