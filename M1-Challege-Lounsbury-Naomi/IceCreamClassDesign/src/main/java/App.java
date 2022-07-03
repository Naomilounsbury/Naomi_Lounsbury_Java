
public class App {

    public static void main(String[] args) {
        com.company.factory.IceCream peanutIceCreamFactory = new com.company.factory.IceCream("Peanut butter", 2.5, .5, "2 days", "cream, sugar, peanut butter, salt");

        com.company.pointofsale.IceCream peanutIceCreamSale =
                new com.company.pointofsale.IceCream("Peanut Butter", 2.5, 100);
        System.out.println(peanutIceCreamSale.getFlavor());
        System.out.println(peanutIceCreamSale.getProfit());
        System.out.println(peanutIceCreamFactory);
        peanutIceCreamFactory.factoryMalfunction("peanuts");
        peanutIceCreamFactory.lengthenProductionTime(5);
        peanutIceCreamFactory.increaseProductionCost(50.00);
        peanutIceCreamSale.aDogStoleAnIceCreamGiveFreeIceCream("mango");
        peanutIceCreamSale.ARobberCameSetProfitToZero();
        peanutIceCreamSale.sale();
    }
}
