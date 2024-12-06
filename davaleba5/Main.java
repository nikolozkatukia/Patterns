package davaleba5;

public class Main {
    public static void main(String[] args) {


        Blog techBlog=new Blog();
        Blog travelBlog=new Blog();

        Subscriber nick=new Subscriber("nikoloz");
        Subscriber giorgi=new Subscriber("giorgi");
        Subscriber saba=new Subscriber("saba");

        techBlog.subscribe(nick);
        techBlog.subscribe(giorgi);
        travelBlog.subscribe(saba);
        travelBlog.subscribe(nick);

        techBlog.newArticle("2024 wlis aqciebi");
        travelBlog.newArticle("politika bavshvebs sheexo");

        techBlog.unsubscribe(giorgi);
        techBlog.newArticle("ragac");


    }
}