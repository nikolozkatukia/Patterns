package davaleba4;

public class Dollar extends Currency {
    private double value;

    public Dollar(double value) {
        this.description= "US Dollar";
        this.value = value;
    }

    @Override
    public double cost(double c) {
        return c * value;
    }

    @Override
    public String toString() {
        return description + " with value: " + value;
    }
}
