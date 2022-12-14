package day57_Polymorphism.PhoneTasks;
/*

    6. create a class named Samsung that can inherit from AndroidApps and Phone
            actions: texting(), calling(), freezing()

             if the price of Samsung is more than 1200, the system should throw an exception with a message of:
                    Invalid Price, Samsung' price cannot more than 1200
 */
public class Samsung extends Phone implements  AndroidApp{
    public Samsung( String model, String size, double price) {
        super("Samsung", model, size, price);
        if (price > 1500){
            throw new RuntimeException("Price of the phone cannot be greater than 1500");
        }

    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is texting "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling "+phoneNumber);
    }

    @Override
    public void download() {
        System.out.println("Samsung is downloading app from "+AppStoreName);
    }

    public void freezing(){
        System.out.println("Samsung is freezing");
    }

}
