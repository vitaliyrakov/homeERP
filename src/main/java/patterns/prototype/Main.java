package java.patterns.prototype;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pattern Prototype");
        Document document1 = new Document(1, "doc1", "type1");
        System.out.println(document1);
        Document document2 = (Document) document1.copy();
        System.out.println(document2);
    }
}
