package domain.model;

public class Client extends Person implements IHaveId{

	private String passportNumber;
	private Payment payment;
	private Employee employee;
	private Tour tour;
	
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Tour getTour() {
		return tour;
	}
	public void setTour(Tour tour) {
		this.tour = tour;
	}
}
