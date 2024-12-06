package davaleba4;

public abstract class Currency {


    protected String description;

    public String getCurrencyDescription() {
        return description;
    }

    public abstract double cost(double value);


}