package davaleba2;

abstract class Employee {

    
    private String saxeli;
    private String gvari;
    private String piradiNomeri;
    private int asaki;

    public Employee(String saxeli, String gvari, String piradiNomeri, int asaki) {
        this.saxeli = saxeli;
        this.gvari = gvari;
        this.piradiNomeri = piradiNomeri;
        this.asaki = asaki;
    }

    public abstract double getSalary();

    @Override
    public String toString() {
        return saxeli+" "+gvari+" "+piradiNomeri+" "+asaki+" "+getSalary();
    }
}