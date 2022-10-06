package day40_CustomClassPractice;
/*
Offer
		Attribute:
			salary, Location, hasPTO, isFullTime, WFH, jobTitle, benefit

		Actions:
			setOfferInfo
			getOfferInfo

		MUST use this keyword
 */
public class Offer {

    double salary;
    String state;
    boolean hasPTO;
    boolean isFullTime;
    boolean isWFH;
    String jobTitle;
    boolean hasBenefit;

    public void setOfferInfo(double salary, String state, boolean hasPTO, boolean isFullTime, boolean isWFH ,String jobTitle, boolean hasBenefit) {
         this.salary = salary;  // local variables are the same those instance variables, then we have to use "this keyword"
         this.state = state;  // we need to make sure left side will be instance variables
         this.hasPTO = hasPTO; // this keyword refers object instance
         this.isFullTime = isFullTime;
         this.isWFH = isWFH;
         this.jobTitle = jobTitle;
         this.hasBenefit = hasBenefit;
    }
    public void getOfferInfo(){ // display the offer info
            System.out.println("==============================");
            System.out.println("Salary: "+salary);
            System.out.println("JobTitle: "+jobTitle);
            System.out.println("Location: "+state);

        }








    }


