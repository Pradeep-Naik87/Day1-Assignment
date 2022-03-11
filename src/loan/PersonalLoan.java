package loan;

public class PersonalLoan {
	private double loanPercentage;
	private int loanAmount;
	private int noOfMonths;
	private String personName;

	public PersonalLoan(double loanPercentage, int loanAmount, int noOfMonths, String personName) {
		this.loanPercentage = loanPercentage;
		this.loanAmount = loanAmount;
		this.noOfMonths = noOfMonths;
		this.personName = personName;
	}

	public double getLoanPercentage() {
		return loanPercentage;
	}

	public int getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getNoOfMonths() {
		return noOfMonths;
	}

	public void setNoOfMonths(int noOfMonths) {
		this.noOfMonths = noOfMonths;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

}
