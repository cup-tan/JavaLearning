package day57_Polymorphism.PhoneTasks;

public class Huawei extends Phone implements  AppleApp{

    public Huawei( String model, String size, double price) {
        super("Huawei", model, size, price);
        if (price > 200){
            throw new RuntimeException("No way Huawei is worth more than 200");
        }
    }

    @Override
    public void download() {
        System.out.println("Huawei is downloading from"+AndroidApp.AppStoreName+" and " +AppleApp.AppStoreName);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Huawei is texting to "+phoneNumber);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Huawei is calling "+phoneNumber);
    }

    public void stealInfo(){
        System.out.println("Huawei is stealing your info");
    }

    @Override
    public String toString() {
        return "Huawei{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                '}';
    }
}
