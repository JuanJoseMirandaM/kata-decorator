package sistemaPublicaciones;

/**
 * @author Juan Jose Miranda
 */

public class DeluxeEdition extends PublicationDecorator {
  public DeluxeEdition(PublicationComponent wrapped) {
    super(wrapped);
  }

  @Override
  public int getPages() {
    return super.getPages() + 50; // Añade 50 páginas extra
  }

  @Override
  public void showDetails() {
    super.showDetails();
    System.out.println(" + Edición de lujo (+50 páginas)");
  }
}
