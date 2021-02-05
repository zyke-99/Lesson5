package net.swedbank.gyk.collections.productmap;

public class Product {

    private String id;
    private String name;

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {

        if (this.hashCode() == obj.hashCode()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id.hashCode() + name.hashCode() * 37 * 13;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
