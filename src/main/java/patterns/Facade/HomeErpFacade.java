package java.patterns.Facade;

public class HomeErpFacade {
    Warehouse warehouse;
    Document document;
    Report report;

    public void buyProduct(Product product) {
        warehouse.addProduct(product);
        warehouse.addMove(product);
        document.input(product);
        report.form(product);
    }

    public void saleProduct(Product product) {
        warehouse.delProduct(product);
        warehouse.delMove(product);
        document.output(product);
        report.form(product);
    }
}
