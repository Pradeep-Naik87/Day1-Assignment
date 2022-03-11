package loan;

public class Bank {

	public static void main(String[] args) {
		PersonalLoan p = new PersonalLoan(10.25 / 100, 25000, 12, "Satya");
		double interest = p.getLoanPercentage() * p.getLoanAmount() * p.getNoOfMonths();
		double totalAmount = p.getLoanAmount() + interest;
		System.out.println("Total amount for the PersonalLoan for : " + p.getPersonName() + " is " + totalAmount);

		HomeLoan h = new HomeLoan(6.25 / 100, 500000, 120, "Surya");
		double interestHome = h.getLoanPercentage() * h.getLoanAmount() * h.getNoOfMonths();
		double totalAmountHome = h.getLoanAmount() + interestHome;
		System.out.println("Total amount for the HomeLoan for : " + h.getPersonName() + " is " + totalAmountHome);

		h.setLoanAmount(600000);
		h.setPersonName("Poorna");
		interestHome = h.getLoanPercentage() * h.getLoanAmount() * h.getNoOfMonths();
		totalAmountHome = h.getLoanAmount() + interestHome;
		System.out.println("Total amount for the HomeLoan for : " + h.getPersonName() + " is " + totalAmountHome);
	}

}
