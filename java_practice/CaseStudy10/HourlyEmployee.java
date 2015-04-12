//this class extends Employee

public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;

    public HourlyEmployee(String first, String last, String ssn, double hourlyWage, double hoursWorked){
	super(first, last, ssn);
	setWage(hourlyWage);
	setHours(hoursWorked);
    }

    public void setWage( double hourlyWage ){

	wage = (hourlyWage < 0.0 ) ? 0.0 :hourlyWage;
    }

    public double getWage() {
	return wage;
    }

    public void setHours( double hoursWorked ){
	hours = ((hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) ) ? hoursWorked : 0.0;
    }

    public double getHours() {
	return hours;
    }

    @Override
    public double earnings() {
	if ( getHours() <= 40)
	    return getWage() * getHours();
	else
	    return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }

    @Override
    public String toString(){
	return String.format("hourly employee: %s\n%s: $%,.2f; %s: %.2f", super.toString(), "hour wage", getWage(), "hours worked", getHours());
    }
}
	
			  
