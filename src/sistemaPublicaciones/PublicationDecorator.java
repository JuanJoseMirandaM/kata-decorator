package sistemaPublicaciones;

/**
 * @author Juan Jose Miranda
 */
public abstract class PublicationDecorator implements PublicationComponent {
  protected PublicationComponent wrapped;

  public PublicationDecorator(PublicationComponent wrapped) {
    this.wrapped = wrapped;
  }

  @Override
  public int getPages() {
    return wrapped.getPages();
  }

  @Override
  public void showDetails() {
    wrapped.showDetails();
  }
}
