package java.patterns.Facade;

public class Main {

    public static void main(String[] args){
        HomeErpFacade homeErpFacade = new HomeErpFacade();
        homeErpFacade.buyProduct(new Product());
        homeErpFacade.buyProduct(new Product());

        homeErpFacade.saleProduct(new Product());
    }

}
