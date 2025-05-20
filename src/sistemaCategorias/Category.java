package sistemaCategorias;

/**
 * @author Juan Jose Miranda
 */
public class Category implements CategoryComponent {
  private String name;
  private int productCount;

  public Category(String name, int productCount) {
    this.name = name;
    this.productCount = productCount;
  }

  @Override
  public int getProductCount() {
    return productCount;
  }

  @Override
  public void showDetails() {
    System.out.println("Categoría: " + name + ", Productos: " + productCount);
  }
}
