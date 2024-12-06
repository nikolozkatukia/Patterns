public class Student {


    private String saxeli;
    private String gvari;
    private String piradiNomeri;
    private int asaki;
    private Universiteti universiteti;

    public Student(String saxeli, String gvari, String piradiNomeri, int asaki, Universiteti universiteti) {
        this.saxeli = saxeli;
        this.gvari = gvari;
        this.piradiNomeri = piradiNomeri;
        this.asaki = asaki;
        this.universiteti = universiteti;
    }

    @Override
    public String toString() {
        return
                saxeli+" "+gvari+" "+piradiNomeri+" "+asaki+" "+universiteti.getDasaxeleba()+" "+(universiteti.isSaxelmwifo() ? "ki" : "ara")+" "+universiteti.getFakultetebi();

    }
}
