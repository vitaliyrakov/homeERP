package java.patterns.prototype;

public class Document implements Copyable {
    private int id;
    private String name;
    private String type;

    public Document(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        Document copyDocument = new Document(id, name, type);
        return copyDocument;
    }
}
