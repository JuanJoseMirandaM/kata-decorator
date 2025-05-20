package sistemaCategorias;

/**
 * @author Juan Jose Miranda
 */
public abstract class CategoryDecorator implements CategoryComponent {
  protected CategoryComponent wrapped;

  public CategoryDecorator(CategoryComponent wrapped) {
    this.wrapped = wrapped;
  }

  @Override
  public int getProductCount() {
    return wrapped.getProductCount();
  }

  @Override
  public void showDetails() {
    wrapped.showDetails();
  }
}