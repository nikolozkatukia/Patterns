package davaleba5;

import java.util.ArrayList;
import java.util.List;

public class Blog {

    private String article;
    private List<Subscriber> subscribers;

    public Blog() {
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void newArticle(String article) {
        this.article = article;
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(article);
        }
    }
}