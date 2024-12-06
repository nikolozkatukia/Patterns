package davaleba4;

public class USDDecorator extends Decorator {

    public USDDecorator(Currency currency) {
        super(currency);
    }

    @Override
    public double cost(double value) {
        return currency.cost(value);
    }

    @Override
    public String getDescription() {
        return currency.getCurrencyDescription();
    }

    @Override
    public String toString() {
        return getDescription();
    }

}