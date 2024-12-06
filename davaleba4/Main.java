package davaleba4;

public class Main {
    public static void main(String[] args) {



        Currency rupee=new Rupee(80);
        Currency dollar=new Dollar(1);

        Currency usdDecorator=new USDDecorator(dollar);

        System.out.println(rupee);
        System.out.println(dollar);
        System.out.println(usdDecorator);

        double amount = 123;
        System.out.println(rupee.cost(amount));
        System.out.println(dollar.cost(amount));
        System.out.println(usdDecorator.cost(amount));
    }
}