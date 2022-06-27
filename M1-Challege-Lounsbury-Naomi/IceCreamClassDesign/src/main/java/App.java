
public class App {

    public static void main(String[] args) {
        com.company.factory.IceCream peanutIceCreamFactory = new com.company.factory.IceCream("peanut butter", 2.5, .5, "2 days", "cream, sugar, peanut butter, salt");

        com.company.pointofsale.IceCream peanutIceCreamSale =
                new com.company.pointofsale.IceCream("peanut Butter", 2.5, 100);
        System.out.println(peanutIceCreamSale.getFlavor());
        System.out.println(peanutIceCreamSale.getCost());
        System.out.println(peanutIceCreamFactory);
    }
}
