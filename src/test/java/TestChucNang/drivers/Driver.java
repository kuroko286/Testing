package TestChucNang.drivers;

public class Driver {
    public String checkHealthy(double bmi) {
        if (bmi <= 0) {
            return "Invalid";
        } else if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

}
