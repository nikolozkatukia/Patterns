package davaleba2;

public class Main {
    public static void main(String[] args) {


        Employee fullTimeEmployee=EmployeeFactory.getEmployee(false,"nikoloz","katukia","8765659756",16,0,0);
        Employee partTimeEmployee=EmployeeFactory.getEmployee(true,"nodar","shubladze","0769645455",25,300,15);

        System.out.println(fullTimeEmployee);
        System.out.println(partTimeEmployee);



    }
}