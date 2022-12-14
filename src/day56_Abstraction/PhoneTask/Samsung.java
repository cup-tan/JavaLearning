package day56_Abstraction.PhoneTask;
//                 samsung is concrete, we can create object from the samsung class, but we cannot create object from abstract class
public final class Samsung extends Phone{

    public Samsung(String model, double price, String size){
        super("Samsung", model,price,size);
        if (price <= 0 || price > 1200){
            throw new RuntimeException("Invalid Price: "+price);
        }
    }

    @Override
    public void calling(long phoneNumber){
        System.out.println("Samsung is calling "+phoneNumber);
    }

    @Override
    public void calling(long num1, long num2) {
        calling(num1);
        calling(num2);
    }

    @Override
    public void texting(long phoneNumber){
        System.out.println("Samsung is texting to "+phoneNumber);
    }

    @Override
    public void texting(long num1, long num2) {

    }

    public void freezing(){ // only unique samsung class, so we didn't create override
        System.out.println("Samsung is freezing");
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
