package net.swedbank.gyk.collections.productset;

import java.time.LocalDateTime;

public class Product {

  private String id;
  private String name;
  private LocalDateTime lastAppearsOn;

    public Product(String id, String name, LocalDateTime lastAppearsOn) {
        this.id = id;
        this.name = name;
        this.lastAppearsOn = lastAppearsOn;
    }

    public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }


    @Override
    public boolean equals(Object obj) {

        if(this.hashCode() == obj.hashCode()) {
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
                ", lastAppearsOn=" + lastAppearsOn +
                '}';
    }
}
