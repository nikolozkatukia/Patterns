package davaleba2;

class EmployeeFactory {

    public static Employee getEmployee(Boolean isFullTime,String saxeli,String gvari,String piradiNomeri,int asaki,double fixedSalaryOrDailySalary,int daysWorked) {

        if (isFullTime) {
            return new FullTime(saxeli,gvari,piradiNomeri,asaki,fixedSalaryOrDailySalary);
        } else {
            return new PartTime(saxeli,gvari,piradiNomeri,asaki,daysWorked,fixedSalaryOrDailySalary);


        }
    }
}