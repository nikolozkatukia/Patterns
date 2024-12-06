import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<String> fakultetebi=new ArrayList<>();
        fakultetebi.add("informaciuli teqnologiebi");
        fakultetebi.add("biznesi");
        fakultetebi.add("ekonomika");

        Universiteti universiteti = Universiteti.getInstance("tsu", true, fakultetebi);

        Student student=new Student("nikoloz", "katukia", "876578647865", 16, universiteti);

        System.out.println(student);
    }
}
