package day57_Polymorphism.PhoneTasks;

public class PhoneObjects {

    public static void main(String[] args) {
        Iphone iphone = new Iphone("12", "5.3", 1000);
        Samsung samsung = new Samsung("S20","6.1",899);
        Huawei huawei = new Huawei("Robery","5.3",25);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(huawei);

        Phone phone1 = new Iphone("11","6",1200);
        Phone phone2 = new Samsung("S8", "6.5",900);
        Phone phone3 = new Huawei("sada", "3",35);

        //  Iphone[] phones = {iphone, samsung , huawei }; // we can only store iphone
        //  Samsung[] phones = {iphone, samsung , huawei };// we can only store samsung
        //  Huawei[] phones = {iphone, samsung , huawei };// we can only store huawei object

        Phone[] phones = { iphone, samsung, huawei, phone1, phone2, phone3};

    }
}
