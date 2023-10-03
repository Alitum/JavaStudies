public class Product {
  private String name;
  private double price;
  private ProductCategory category;

  public Product(String name, double price, ProductCategory category) {
    this.name = name;
    this.price = price;
    this.category = category;
  }

  @Override
  public String toString() {
    return "Product [Name: " + name + " | Price: " + price + " | Category: " + category + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    long temp;
    temp = Double.doubleToLongBits(price);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + ((category == null) ? 0 : category.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Product other = (Product) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
      return false;
    if (category != other.category)
      return false;
    return true;
  }

}
