package davaleba4;

public abstract class Decorator extends Currency {


    protected Currency currency;

    public Decorator(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String getCurrencyDescription() {
        return currency.getCurrencyDescription();
    }

    public abstract String getDescription();


}