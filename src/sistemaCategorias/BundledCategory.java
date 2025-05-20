package sistemaCategorias;

/**
 * @author Juan Jose Miranda
 */
public class BundledCategory extends CategoryDecorator {
  public BundledCategory(CategoryComponent wrapped) {
    super(wrapped);
  }

  @Override
  public int getProductCount() {
    return super.getProductCount();
  }

  @Override
  public void showDetails() {
    super.showDetails();
    System.out.println(" + Incluye un regalo");
  }
}
