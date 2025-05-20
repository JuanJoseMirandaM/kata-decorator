package sistemaCategorias;

/**
 * @author Juan Jose Miranda
 */
public class PromotedCategory extends CategoryDecorator {
  public PromotedCategory(CategoryComponent wrapped) {
    super(wrapped);
  }

  @Override
  public int getProductCount() {
    return super.getProductCount();
  }

  @Override
  public void showDetails() {
    super.showDetails();
    System.out.println(" + Promoción activa (mitad de precio!)");
  }
}
