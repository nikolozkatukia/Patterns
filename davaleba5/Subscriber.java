package davaleba5;

public class Subscriber {


    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String article) {
        System.out.println("Subscriberma - "+name+" shemachnia "+article);
    }
}