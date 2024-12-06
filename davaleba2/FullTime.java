package davaleba2;

class FullTime extends Employee {

    private double fixedSalary;

    public FullTime(String saxeli, String gvari, String piradiNomeri, int asaki, double fixedSalary) {
        super(saxeli, gvari, piradiNomeri, asaki);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double getSalary() {
        return fixedSalary;
    }
}