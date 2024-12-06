package davaleba4;

public class Rupee extends Currency {
    private double value;

    public Rupee(double value) {
        this.description= "Indian Rupee";
        this.value=value;
    }

    @Override
    public double cost(double c) {
        return c*value;
    }

    @Override
    public String toString() {
        return description+" with value: "+value;
    }
}