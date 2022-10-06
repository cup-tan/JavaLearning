package day57_Polymorphism.PhoneTasks;
/*
 5. create a class named iPhone that can inherit from AppleApp and Phone
            actions: texting(), calling(), faceTiming()

            if the price of iPhone is more than 1500, the system should throw an exception with a message of:
                    Invalid Price, iPhone' price cannot more than 1500
 */
public class Iphone extends Phone implements AppleApp, Downloadable{
// second this class need a constructor method
    public Iphone( String model, String size, double price) {
        super("Iphone",model, size, price);
        if (price > 1500){
            throw new RuntimeException("Iphone price cannot be greater than 1500");
        }
    }

    @Override // first we need to imply abstract method
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling "+phoneNumber);
    }

    @Override
    public void download() {
        System.out.println("Iphone is downloading app from "+AppStoreName);
    }

    public void faceTiming(long phoneNumber){
        System.out.println("Iphone is face timing "+phoneNumber);
    }


    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }
}
