package Day49_Practices;

import java.util.ArrayList;
import java.util.Arrays;
/*
    task02:
	1. create an abstract class named Employees
			private variables: employeeName, employeeId, salary, ssn, JobtiTle, isFullTime, hasPTO
			encapsulate all private variables
			abstract methods: work(), meeting()
			instance Methods: toString()
     */
abstract public class Employees {
    private String employeeName;
    private String employeeId;
    private double salary;
    private long ssn;
    private String jobTitle;
    private boolean isFullTime;
    private boolean hasPTO;

    public Employees(String employeeName, String employeeId, double salary, long ssn, String jobTitle, boolean isFullTime, boolean hasPTO) {
        setEmployeeName(employeeName);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
        setSsn(ssn);
        setFullTime(isFullTime);
        setHasPTO(isHasPTO());
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public boolean isHasPTO() {
        return hasPTO;
    }

    public void setHasPTO(boolean hasPTO) {
        this.hasPTO = hasPTO;
    }

    abstract void work();

    abstract void meeting();

    public String toString() {
        return "Name is: " + getEmployeeName() + ", ID is: " + getEmployeeId() + ", salary is: $" + getSalary() + ", job title is: " + getJobTitle()
                + ", SSN is: " + getSsn() + ", " + isFullTime() + ", " + isHasPTO();
    }
}

/*
2. create an interface named ScrumTeam
			variable: has_ScrumMaster
			abstract methods: dailyStandUp()
			*/
	interface ScrumTeam{
	    boolean has_ScrumMaster=true;
        public void dailyStandUp();

    boolean isFullTime();
}
			/*

	3. create an interface named WorkRemotely
			abstract method: workFromHome();
			*/
interface WorkRemotely{

    void workFromHome();
}

/*

	4. create a final class named Tester that can inherit Employees, ScrumTeam, and WorkRemotely
			actions: findingBug(), creatingTicket()

			*/

final class Tester extends Employees implements ScrumTeam, WorkRemotely {

    public Tester(String employeeName, String employeeId, double salary, long ssn, String jobTitle, boolean isFullTime, boolean hasPTO) {
        super(employeeName, employeeId, salary, ssn, jobTitle, isFullTime, hasPTO);
    }

    public void findingBug(){
        System.out.println(getEmployeeName()+" finds bug while testing");
    }

    public void creatingTicket(){
        System.out.println(getEmployeeName()+" creates ticket if there is bug");
    }

    @Override
    void work() {
        System.out.println(getEmployeeName()+" is working");
    }

    @Override
    void meeting() {
        System.out.println(getEmployeeName()+" has a meeting");
    }

    @Override
    public void dailyStandUp() {
        System.out.println(getEmployeeName()+" has daily stand up meeting everyday");
    }

    @Override
    public void workFromHome() {
        System.out.println(getEmployeeName()+" works from home every Friday");
    }
}

/*
	5. create a final class named Developer that can inherit Employees, ScrumTeam, and WorkRemotely
			set a constructor that can initialize fields (instance variables)
*/
final class Developer extends Employees implements ScrumTeam, WorkRemotely {

    public Developer(String employeeName, String employeeId, double salary, long ssn, String jobTitle, boolean isFullTime, boolean hasPTO) {
        super(employeeName, employeeId, salary, ssn, jobTitle, isFullTime, hasPTO);
    }

    @Override
    void work() {
        System.out.println(getEmployeeName()+" is working");
    }

    @Override
    void meeting() {
        System.out.println(getEmployeeName()+" has a meeting");
    }

    @Override
    public void dailyStandUp() {
        System.out.println(getEmployeeName()+" has daily stand up meeting everyday");
    }

    @Override
    public void workFromHome() {
        System.out.println(getEmployeeName()+" works from home every Friday");
    }
}

/*
	6. create a class named AppleInc:
			create 2 Tester' and 3 Developer' objects
			create a list of ScrumTeam and store all Tester's and Developer's objects
			Iterator the list of scrum team to display the information of the full time employees
 */

class AppleInc {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Ali", "123456", 90000, 987654, "QA", false, false);
        Tester tester2 = new Tester("Fatih", "123457", 110000, 987564, "Senior QA", true, true);

        Developer dev1 = new Developer("Ayse", "456321", 95000, 789412, "Developer", false, false);
        Developer dev2 = new Developer("Kerem", "789652", 115000, 546879, "Developer", true, true);
        Developer dev3 = new Developer("Asli", "952741", 130000, 954524, "Senior Developer", true, true);

        ArrayList<ScrumTeam> teamList= new ArrayList<>(Arrays.asList(tester1,tester2,dev1,dev2,dev3));

       for(int i=0; i<teamList.size(); i++){
           if(teamList.get(i).isFullTime()){
               System.out.println(teamList.get(i));
           }
       }

    }
}
