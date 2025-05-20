package sistemaPublicaciones;

/**
 * @author Juan Jose Miranda
 */
public class IllustratedEdition extends PublicationDecorator {
  public IllustratedEdition(PublicationComponent wrapped) {
    super(wrapped);
  }

  @Override
  public int getPages() {
    return super.getPages() + 30; // Añade 30 páginas por ilustraciones
  }

  @Override
  public void showDetails() {
    super.showDetails();
    System.out.println(" + Edición ilustrada (+30 páginas)");
  }
}
