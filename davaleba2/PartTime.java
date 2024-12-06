package davaleba2;

class PartTime extends Employee {

    private int daysWorked;
    private double dailySalary;

    public PartTime(String saxeli, String gvari, String piradiNomeri, int asaki, int daysWorked, double dailySalary) {
        super(saxeli, gvari, piradiNomeri, asaki);
        this.daysWorked = daysWorked;
        this.dailySalary = dailySalary;
    }

    @Override
    public double getSalary() {
        return daysWorked*dailySalary;
    }
}
