package day47_Encapsulations;

public class Encapsulation {

    private long ssn = 1234567;


    public long getSsn(){ // to read only
        return ssn;
    }
//                         this ssn also the same private data
    public void setSsn(long ssn){ // because private data we have, so we use getter and setter method
             this.ssn = ssn;
    }

}
