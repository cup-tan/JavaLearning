package day59_OOPReview;

import java.time.LocalDate;

public class Encapsulation {

    private int ssn; //12345
                    // 54321 assigning setter


    private final LocalDate Published = LocalDate.of(2020,9,8); // cannot be modified


    public int getSsn(){ // instance method
        return ssn;
    }

    public void setSsn(int ssn){ // modify only
        this.ssn = ssn;
    }

    public LocalDate getPublished(){
        return Published;
    }

    //public void setPublished (LocalDate Published){
      //  this.Published = Published;
   // }





}
